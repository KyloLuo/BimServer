package com.modelmanage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.modelmanage.po.OVersion;
import com.modelmanage.po.OperationFather;
import com.modelmanage.po.PhotoFather;
import com.modelmanage.po.ValueStore;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.modelmanage.enumtype.operatorType;
import com.modelmanage.enumtype.pathType;
import com.modelmanage.enumtype.priorityType;
import com.modelmanage.enumtype.xmlType;

public class DAL {
    private String BaseUrl;

    private String UserBy;

    private String ProjectId;

    private pathType PType;

    public String getBaseUrl() {
        return this.BaseUrl;
    }

    public String getUserBy() {
        return UserBy;
    }

    public void setUserBy(String userBy) {
        UserBy = userBy;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public pathType getPathType() {
        return PType;
    }

    public void setPathType(pathType pType) {
        PType = pType;
    }

    public void setBaseUrl(String baseUrl) {
        BaseUrl = baseUrl;
    }

    /// <summary>
    /// ��ȡ��Ŀ��·��
    /// </summary>
    /// <returns>url</returns>
    public void initPath()
    {
        if (this.PType == pathType.local) this.initLocalPath();
        if (this.PType == pathType.global) this.initGlobalPath();
    }
    public long getTiming()
    {
        return System.currentTimeMillis();
    }
    public String getProjectUrl() {
        return this.getBaseUrl() + "\\" + this.ProjectId;
    }
    /// <summary>
    /// ʵ����DAL��
    /// </summary>
    /// <param name="url">���ݿ�Ŀ¼</param>
    /// <param name="userBy">����</param>
    /// <param name="projectId">��Ŀid</param>
    /// <param name="pType">·�����ͣ������򱾵ؿ⣩</param>
    public DAL(){}
    public DAL(String url, String userBy, String projectId, pathType pType) throws Exception{
        this.BaseUrl = url;
        if (userBy.contains("Global"))
        {
            throw new Exception("can not set the the userBy contains Global");
        }
        this.UserBy = userBy;
        this.ProjectId = projectId;
        this.PType = pType;

        // �������ؿ�ʱ�ų�ʼ������·��
        if (Integer.parseInt(pType.toString()) == 0)
        {
            this.initLocalPath();
        }
        else
        {
            // ���������ʱ�ų�ʼ�������
            this.initGlobalPath();
        }
    }
    // <summary>
    // ʵ����DAL��(��userBy,ֻ���ڳ�ʼ���汾����¡��ʱʹ��)
    // </summary>
    // <param name="url">���ݿ�Ŀ¼</param>
    // <param name="projectId">��Ŀid</param>
    // <param name="ptype">����·������</param>
    public DAL(String url, String projectId, pathType ptype)
    {
        this.BaseUrl = url;
        this.ProjectId = projectId;
        this.PType = ptype;
        this.initGlobalPath();
    }

    // <summary>
    // ��ʼ�����ذ汾��·��
    // </summary>
    public void initLocalPath() {
        String url = this.getProjectUrl() + "\\"+this.UserBy+"\\";
        File file = new File(url);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
    // <summary>
    // ��ʼ������汾��·��
    // </summary>
    public void initGlobalPath()
    {
        String url = this.getProjectUrl() + "\\Glabal\\";
        File file = new File(url);
        if (!file.exists())
        {
            file.mkdirs();
        }
    }
    // <summary>
    // ��ȡ�汾��·����������Ŀid��userby��
    // </summary>
    // <returns>url</returns>
    public String getLocalPath()
    {
        return getProjectUrl() + "\\" + this.UserBy + "\\";
    }
    // <summary>
    // ��ȡ����汾��·����������Ŀid��userby��
    // </summary>
    // <returns>url</returns>
    public String getGlobalPath()
    {
        return getProjectUrl() + "\\Glabal\\";
    }

    // <summary>
    // ���������ȡ������xml·�������ذ汾�⣩
    // </summary>
    // <param name="type">��������</param>
    // <returns>������xml·�������ذ汾�⣩</returns>
    public String getLocalPath(xmlType type) {
        return getProjectUrl() + "\\" + this.UserBy + "\\" + type.toString() + ".xml";
    }
    // <summary>
    // ���������ȡ������xml·��������汾�⣩
    // </summary>
    // <param name="type">��������</param>
    // <returns></returns>
    public String getGlobalPath(xmlType type) {
        return getProjectUrl() + "\\Glabal\\"+type.toString()+".xml";
    }
    // <summary>
    // ����·�����ͻ�ȡ·��
    // </summary>
    // <param name="type">������</param>
    // <returns></returns>
    public String getRelPathByPathType(xmlType type) {
        return Integer.parseInt(this.PType.toString()) == 0 ? this.getLocalPath(type) : this.getGlobalPath(type);
    }
    //����ͨ�� by ljn
    public void Save (Document document,String url)
    {
        try {
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(url),format);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /// <summary>
    /// ��xml����
    /// </summary>
    /// <param name="type">���ļ�������</param>
    /// <returns>XmlDocument����</returns>
    // ����ͨ�� by ljn
    public Document open(xmlType type) {
        String url = getRelPathByPathType(type);
        return this.getXmlDc(type, url);
    }
    /// <summary>
    /// ��xml����
    /// </summary>
    /// <param name="type">xml����</param>
    /// <param name="url">����·��</param>
    /// <returns>XmlDocument����</returns>
    public Document open(xmlType type, String url) {
        return this.getXmlDc(type, url);
    }
    /// <summary>
    /// ����open����������xmlType��urlȷ��·��
    /// </summary>
    /// <param name="type"></param>
    /// <param name="url"></param>
    /// <returns></returns>
    public Document getXmlDc(xmlType type, String url){
        File file = new File(url);
        if (!file.exists())
        {
            Document xmlDoc = DocumentHelper.createDocument();
            org.dom4j.Element data = xmlDoc.addElement("data");
            data.addElement("count").setText("0");


            if (type.toString().equalsIgnoreCase("version") || type.toString().equalsIgnoreCase("photo"))
            {
                this.createElement(data, "lastVersion", "0");
                //data.addElement("lastVersion").setText("0");
            }
            if (type.toString().equalsIgnoreCase("version"))
            {
                this.createElement(data, "number", "0");
                //data.addElement("number").setText("0");
            }
            if (type.toString().equalsIgnoreCase("setting")) {
                // ���¡���Զ��·��
                this.createElement(data, "origin", "");
                //data.addElement("origin").setText("");
                // ���¡˲ʱԶ�̿�İ汾
                this.createElement(data, "slastVersion", "0");
                //data.addElement("slastVersion").setText("0");
                // ��¡˲ʱԶ�̿�İ汾����
                this.createElement(data, "snumber", "0");
                //data.addElement("snumber").setText("0");
            }

            Save(xmlDoc, url);
        }
        Document document = null;
        try {
            File urlfile = new File(url);
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(urlfile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
//			System.out.println(document.toString());
    }

    /// <summary>
    /// xml����Ԫ��
    /// </summary>
    /// <param name="xml">xml����</param>
    /// <param name="parent">���ڵ�</param>
    /// <param name="childType">�ӽڵ�����</param>
    /// <param name="txt">�ӽڵ�����</param>
    //	����ͨ�� by ljn
    public void createElement(Element element, String childType, String txt)
    {
        element.addElement(childType).setText(txt);
    }

    /// <summary>
    /// xml����Ԫ��
    /// </summary>
    /// <param name="xml">xml����</param>
    /// <param name="parent">���ڵ�</param>
    /// <param name="childType">�ӽڵ�</param>
    /// <returns>�����Ķ���</returns>
    //	����ͨ�� by ljn
    public Element createElementNode(Element parent, String childType)
    {
        Element element = parent.addElement(childType);
        return element;
    }
    /// <summary>
    /// xml����Ԫ��
    /// </summary>
    /// <param name="xml">xml����</param>
    /// <param name="parent">���ڵ�</param>
    /// <param name="childType">�ӽڵ�</param>
    /// <param name="innerText">ֵ</param>
    /// <returns>�����Ķ���</returns>
    //	����ͨ�� by ljn
    public Element createElementNode(Element parent, String childType, String innerText)
    {
        Element element = this.createElementNode(parent, childType);
        element.setText(innerText);
        return element;
    }
    /// <summary>
    /// ����nodeֵ
    /// </summary>
    /// <param name="node">node�ڵ�</param>
    /// <param name="value">ֵ</param>
    //	����ͨ�� by ljn
    public void setValue(Element element, String value) {
        element.setText(value);
    }

    /// <summary>
    /// ��object����xml
    /// </summary>
    /// <param name="type">object����</param>
    /// <param name="obj">object</param>
    /// <returns>������</returns>
    public boolean setObject2xml(xmlType xmlType,Object obj) {
        String url = getRelPathByPathType(xmlType);
        Document xml = this.open(xmlType);
        //��ȡ���ڵ�
        Element root = xml.getRootElement();
        //����countֵ
        Element countNode = (Element) xml.selectNodes("//count").get(0);
        int count = Integer.parseInt(countNode.getText());

        //��ӽڵ�
        if (obj instanceof OperationFather /*|| ((ArrayList)obj).get(0) instanceof OperationFather*/) // ��������ǲ�������
        {
            boolean flag = true; // �Ƿ�洢��ǰ�����Operation
            OperationFather operation = (OperationFather)obj;

            //List<XmlElement> removeList = new List<XmlElement>();//����Ƴ�����
            List<Element> removeList = new ArrayList<Element>(); // ���Ƴ�������

            //������ͬһʵ��Ĳ�����ֻ�������²���
            //Ŀǰֻ�Բ������ԵĲ����Զ��ϲ��������������ʱ��
            if (operation.getOperatorType().toString().equalsIgnoreCase("Modify")) {
                for(Object item : xml.selectNodes("//"+xmlType.toString()))
                {
                    Element node = (Element)item;
                    if (node.attributeValue("OperateOid") == operation.getOperateOid() && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type").equalsIgnoreCase("Modify"))
                    {
                        // node��xml�����
                        // operation�Ǵ����
                        // removeList.Add(node);


                        // ԭʼ��
                        //removeNode = node;
                        //count -= 1;
                        //this.setValue(countNode, count + "");

                        //��
                        if(node.attributeValue("OldValue")!= operation.getValue().getNewValue()
                                && node.attributeValue("NewValue")==operation.getValue().getOldValue())
                        {
                            // ���²�����ĩֵ��һ��, ��ĩ��ֵ��ͬ
                            // �� 1->2, 2->3 //  ������1->2, 3->5
                            operation.setValue(new ValueStore(node.attributeValue("OldValue"), operation.getValue().getNewValue()));
                            removeList.add(node);
                            count --;
                            this.setValue(countNode, count + "");
                        }
                        else if(node.attributeValue("OldValue") == operation.getValue().getNewValue())
                        {
                            flag = false;
                            removeList.add(node);
                            count --;
                            this.setValue(countNode, count + "");
                        }
                        else
                        {
                            flag = false;
                            return true;
                        }
                        break;
                    }
                }
            }
            if (operation.getOperatorType().toString().equalsIgnoreCase("Delete"))
            {

                for (Object o : xml.selectNodes("//"+xmlType.toString()))
                {
                    Element node = (Element) o;
                    // ʵ�����Ϊdelete ��ͬһ�汾δ�ύǰ����Ӳ���
                    if ((node.attributeValue("OperateOid") == operation.getOperateOid() && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type") == "Add")
                            || (node.attributeValue("OperateOid").contains(operation.getOperateOid()+":") && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type") == "Modify"))
                    {
                        removeList.add(node);
                        count--;
                        this.setValue(countNode, count + "");
                        if (node.attributeValue("Type") == "Add")
                        {
                            flag = false;// �������operation
                        }
                    }

                }
            }

            // �Ƴ����Ƴ��Ľڵ�
            if (removeList.size()>0) {
                for (Element item : removeList)
                {
                    root.remove(item);
                }
            }

            // �洢node
            if (flag) {
                this.setValue(countNode, (count + 1) + "");
                setAttributeByObject(this.createElementNode(root, xmlType.toString()), operation);
            }
        /*    OperationFather operation = (OperationFather)obj;

            //List<XmlElement> removeList = new List<XmlElement>();//����Ƴ�����
            Element removeNode = null;// ����Ƴ�����

            //������ͬһʵ��Ĳ�����ֻ�������²���
            for (Object item : xml.selectNodes("//"+xmlType.toString()))
            {
                Element node = (Element)item;
                if (node.attributeValue("OperateOid").equals(operation.getOperateOid()))
                {
                    if (Long.parseLong(node.attributeValue("Time")) <= operation.getTime())
                    {
                        // removeList.Add(node);
                        removeNode = node;
                        String removeNodeOldValue = removeNode.attributeValue("OldValue");
						root.remove(removeNode);
						operation.getValue().setOldValue(removeNodeOldValue);
						//��Ӽ��oldValue��newValue������  �Լ�����ɾ��ͬһʵ��

                        count -= 1;
                        this.setValue(countNode, count + "");
                        break;
                    }
                }
            }
            //foreach (var item in removeList)
            //{
            //    root.RemoveChild(item);
            //}
            if (removeNode != null) {
                root.remove(removeNode);

            }
            this.setValue(countNode, (count + 1) + "");
            setAttributeByObject(this.createElementNode(root, xmlType.toString()), operation);*/


        }
        else if (obj instanceof OVersion) // ��������ǰ汾����
        {
            Element numNode = (Element) xml.selectNodes("//number").get(0); // ��ȡ�ܵİ汾��Ŀ
            int num = Integer.parseInt(numNode.getText())+1;

            Element lastVersion = (Element) xml.selectNodes("//lastVersion").get(0);
            this.setValue(lastVersion, (Integer.parseInt(lastVersion.getText())+1) + "");
            OVersion vs = (OVersion)obj;
            this.setValue(countNode, (count + 1) + "");
            Element node = this.createElementNode(root, xmlType.toString());
            this.setAttributeByObject(node, vs, xml, num+"");
            this.setValue(numNode,  num+ "");
        }
        else if (obj instanceof PhotoFather || ((ArrayList)obj).get(0) instanceof PhotoFather) {  // ��������ǿ��ռ���
            for (PhotoFather item : (List<PhotoFather>)obj)
            {
                count += 1;
                Element node = this.createElementNode(root, "photo");
                this.setAttributeByObject(node, item); // ���ô���Ķ�������
            }
            this.setValue(countNode, count+"");
        }
        Save(xml, url);
        return true;

    }

    /// <summary>
    /// ����Operation��������
    /// </summary>
    /// <param name="node">���ڵ�</param>
    /// <param name="operation">����</param>
    public void setAttributeByObject(Element node, OperationFather operation) {

        node.addAttribute("Oid", operation.getOid());
        node.addAttribute("OperateOid", operation.getOperateOid());
        node.addAttribute("Type", operation.getOperatorType().toString());
        node.addAttribute("Time", String.valueOf(operation.getTime()));
        node.addAttribute("OldValue", operation.getValue().getOldValue());
        node.addAttribute("NewValue", operation.getValue().getNewValue());
    }
    /// <summary>
    /// ����Version��������
    /// </summary>
    /// <param name="node">���ڵ�</param>
    /// <param name="vs">OVersion</param>
    /// <param name="num">version�ļ���</param>
    public void setAttributeByObject(Element node, OVersion vs, Document xml, String num)
    {
        node.addAttribute("num", num);
        node.addAttribute("Priority", String.valueOf(vs.getPriority()));
        node.addAttribute("UserBy", vs.getUserBy());
        node.addAttribute("Email", vs.getEmail());
        node.addAttribute("Time", String.valueOf(vs.getTime()));
        node.addAttribute("Description", vs.getDescription());
        node.addAttribute("GUID", vs.getGUID().toString());
        createElementNode(node, "operationCount", String.valueOf(vs.getOperationList().size()));
        for (OperationFather item : vs.getOperationList())
        {

            Element operation = this.createElementNode(node, "operation");
            operation.addAttribute("Oid", item.getOid());
            operation.addAttribute("OperateOid", item.getOperateOid());
            operation.addAttribute("Type", item.getOperatorType().toString());
            operation.addAttribute("Time", String.valueOf(item.getTime()));
            operation.addAttribute("OldValue", item.getValue().getOldValue());
            operation.addAttribute("NewValue", item.getValue().getNewValue());
            operation.addAttribute("Priority", String.valueOf(vs.getPriority()));
//            node.AppendChild(operation);
        }
    }

    /// <summary>
    /// ���ݿ�����������
    /// </summary>
    /// <param name="node">���ڵ�</param>
    /// <param name="photo">���ն���</param>
    public void setAttributeByObject(Element node, PhotoFather photo) {
       /* node.addAttribute("OperateOid", photo.getOperateOid());
        node.addAttribute("Type", photo.getOperatorType().toString());
        node.addAttribute("OldValue", photo.getValue().getOldValue());
        node.addAttribute("NewValue", photo.getValue().getNewValue());*/
        node.addAttribute("OperateOid", photo.getOperateOid());
        node.addAttribute("Type", photo.getOperatorType().toString());
        //node.SetAttribute("OldValue", photo.getValue().getOldValue());
        if (photo.getOperatorType() == operatorType.Add || photo.getOperatorType() == operatorType.Modify) {
            node.addAttribute("NewValue", photo.getNewValue());
        }
        if (photo.getOperatorType() == operatorType.Delete)
        {
            node.addAttribute("OldValue", photo.getOldValue());
        }
    }

    public List<OperationFather> getListByOperation() {
        List<OperationFather> list = new ArrayList<OperationFather>();
        Document xml = this.open(xmlType.operation);
        for (Element item : (List<Element>)xml.selectNodes("//operation"))
        {

            list.add(new OperationFather(
                    item.valueOf("@OperateOid"),
                    operatorType.valueOf(item.valueOf("@Type")),
                    Long.parseLong(item.valueOf("@Time")),
                    item.valueOf("@OldValue"),
                    item.valueOf("@NewValue"),
                    item.valueOf("@Oid")
            ));
        }
        return list;
    }

    /// <summary>
    /// ���Operation
    /// </summary>
    /// <returns>���</returns>
    public boolean clearOperation() {
        File file = new File(getRelPathByPathType(xmlType.operation));//ֱ��ɾ���ļ��������´���һ��
        file.delete();
        Document xml = this.open(xmlType.operation);
        return true;
    }

    /// <summary>
    /// �ڲ������ã����ÿ��գ�
    /// </summary>
    /// <returns></returns>
    private boolean setPhoto() {
        Document xml = this.open(xmlType.version); // ��Version������
        //��ȡ��ǰ���հ汾
        int lastVersion =Integer.parseInt(
                ((Element) xml.selectNodes("//lastVersion").get(0)).getText()
        );

        Map<String, Element> dc = new HashMap<String, Element>();// ���ڼ�¼������������Լ�xmlNode������
        List<String> nodeIDForRemove = new ArrayList<String>();

        for (int i = 0; i < lastVersion; i++)
        {
            Element item = (Element)xml.selectNodes("//version").get(i);
            // ����operationNode��Ĳ����ڵ�
            for (Element operationNode : (List<Element>)item.selectNodes("./operation"))
            {
                String id = operationNode.valueOf("@OperateOid");
                if (dc.containsKey(id))
                {
                    // ���ֵ���ڸ�keyͬʱ�����ֵ��е�timeС���½ڵ��time�򸲸�(����ĩֵ�ϲ�)
                    // Ȩ�޸��ҵĸ����ֵ���Ȩ�޵͵�
                    if ( Integer.parseInt(dc.get(id).valueOf("@Priority")) <=  Integer.parseInt(operationNode.valueOf("@Priority")))
                    {
                        if (Long.parseLong(dc.get(id).valueOf("@Time")) <= Long.parseLong(operationNode.valueOf("@Time").trim()))
                        {
                            // ԭʼ
                            // dc[id] = operationNode;

                            // �޸ĺ�
                            if (operationNode.valueOf("@Type").equalsIgnoreCase("Modify"))
                            {
                                dc.put(id, operationNode);
                            }
                            else if (operationNode.valueOf("@Type").equalsIgnoreCase("Delete"))
                            {
                                /** nodeIDForRemove.add(id);
                                 var nodeForRemove = from d in dc where d.Key.StartsWith(id + ":") select d;
                                 // ģ��ƥ�䵽������Ҫ�Ƴ������Լ���ӵȽڵ�
                                 for(Map<String, Element> k : nodeForRemove)
                                 {
                                 nodeIDForRemove.add(k.Key);
                                 }*/
                            }
                        }
                    }
                    else {
                        continue;
                    }
                }
                else {
                    // ������key�����
                    dc.put(id, operationNode);// �����ֵ�
                }
            }
        }
        // ��������
        for (String nodeId : nodeIDForRemove)
        {
            dc.remove(nodeId);
        }
        File file = new File(this.getRelPathByPathType(xmlType.photo));
        file.delete();//ֱ��ɾ���ļ��������´���һ��
        Document xmlPhoto = this.open(xmlType.photo); // ��photo������
        int count = Integer.parseInt(((Element)xmlPhoto.selectNodes("//count").get(0)).getText());
        ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(lastVersion+"");
        Save(xmlPhoto,this.getLocalPath(xmlType.photo));
        List<PhotoFather> ls = new ArrayList<PhotoFather>();
        for (Map.Entry<String, Element> item : dc.entrySet())// �����ֵ� ��ȡphoto����
        {
            if (item.getValue().valueOf("@Type").equalsIgnoreCase("Add") || item.getValue().valueOf("@Type").equalsIgnoreCase("Modify"))
            {
                ls.add(new PhotoFather(
                        item.getValue().valueOf("@OperateOid"),
                        operatorType.valueOf(item.getValue().valueOf("@Type")),
                        item.getValue().valueOf("@NewValue")
                ));
            }
            else if (item.getValue().valueOf("@Type").equalsIgnoreCase("Delete"))
            {
                ls.add(new PhotoFather(
                        item.getValue().valueOf("@OperateOid"),
                        operatorType.valueOf(item.getValue().valueOf("@Type")),
                        item.getValue().valueOf("@OldValue")
                ));
            }
        }


        this.setObject2xml(xmlType.photo, ls);// ��photo���д���xml
        return true;
    }
    /// <summary>
    /// �ڲ������ã�׷�ӿ��գ�
    /// </summary>
    /// <returns></returns>
    private boolean appendPhoto()
    {
        Document xmlVersion = this.open(xmlType.version); // ��Version������
        Document xmlPhoto = this.open(xmlType.photo); // ��photo������
        //��ȡ��ǰ���հ汾
        int lastVersion = Integer.parseInt(((Element)xmlVersion.selectNodes("//lastVersion").get(0)).getText());
        //��ȡphoto�а汾
        int photoVersion = Integer.parseInt(((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).getText());

        if (lastVersion == photoVersion)// �����ǰ�����°汾ֱ�ӷ���
        {
            return true;
        }


        Map<String, Element> dc = new HashMap<String, Element>();// ���ڼ�¼������������Լ�xmlNode������
        List<String> nodeIDForRemove = new ArrayList<String>();// ���Ƴ��ڵ�
        for (Element item : (List<Element>)xmlPhoto.selectNodes("//photo"))
        {
            dc.put(item.attributeValue("OperateOid"), item);
        }


        // �Ƴ�ԭ��photo�еĽڵ�
        for (Map.Entry<String, Element> item : dc.entrySet())
        {
            ((Element)xmlPhoto.selectSingleNode("data")).remove(item.getValue());
            ((Element)xmlPhoto.selectNodes("//count").get(0)).setText(
                    (Integer.parseInt(((Element)xmlPhoto.selectNodes("//count").get(0)).getText()) - 1)+""
            );
        }


        for (int i = photoVersion; i < lastVersion; i++)
        {
            Element item = (Element)xmlVersion.selectNodes("version").get(i);
            // ����operationNode��Ĳ����ڵ�
            for (Element operationNode : (List<Element>)item.selectNodes("operation"))
            {
                String id = operationNode.valueOf("@OperateOid");
                if (dc.containsKey(id))
                {
                    // ���ֵ���ڸ�keyͬʱ�����ֵ��е�timeС���½ڵ��time�򸲸�
                    // Ȩ�޸��ҵĸ����ֵ���Ȩ�޵͵�
                    //if (Convert.ToInt32(dc[id].GetAttribute("Priority")) <= Convert.ToInt32(operationNode.GetAttribute("Priority"))) {
                    //   if (Convert.ToInt32(dc[id].GetAttribute("Time")) <= Convert.ToInt32(operationNode.GetAttribute("Time")))
                    if (true)
                    {
                        if (true)
                        {
                            // ԭʼ
                            // dc[id] = operationNode;

                            // �޸ĺ�
                            if (operationNode.valueOf("@Type").equalsIgnoreCase("Modify"))
                            {
                                dc.put(id, operationNode);
                            }
                            else if (operationNode.valueOf("@Type").equalsIgnoreCase("Delete"))
                            {
                                nodeIDForRemove.add(id);
                                //var nodeForRemove = from d in dc where d.Key.StartsWith(id + ":") select d;
                                Map<String, Element> nodeForRemove = null;
                                for(Map.Entry<String, Element> d : dc.entrySet())
                                {
                                    if(d.getKey().startsWith(id+":")){
                                        nodeForRemove.put(d.getKey(), d.getValue());
                                    }
                                }
                                // ģ��ƥ�䵽������Ҫ�Ƴ������Լ���ӵȽڵ�
                                for (Map.Entry<String, Element> k : nodeForRemove.entrySet())
                                {
                                    nodeIDForRemove.add(k.getKey());
                                }
                            }
                        }
                    }
                    //else {
                    //    continue;
                    //}
                }
                else {
                    dc.put(id, operationNode);// �����ֵ�
                }
            }

        }

        // �Ƴ�dc�б�ɾ����element��������
        for (String nodeId : nodeIDForRemove)
        {
            dc.remove(nodeId);
        }

        ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(lastVersion+"");
        List<PhotoFather> ls = new ArrayList<PhotoFather>(); // dc��valueת��photo����
        for (Map.Entry<String, Element> item : dc.entrySet())// �����ֵ� ��ȡphoto����
        {
            if (item.getValue().valueOf("@Type").equalsIgnoreCase("Add") || item.getValue().valueOf("@Type").equalsIgnoreCase("Modify"))
            {
                ls.add(new PhotoFather(
                        item.getValue().valueOf("@OperateOid"),
                        operatorType.valueOf(item.getValue().valueOf("@Type")),
                        item.getValue().valueOf("@NewValue")
                ));
            }
            else if (item.getValue().valueOf("@Type").equalsIgnoreCase("Delete"))
            {
                ls.add(new PhotoFather(
                        item.getValue().valueOf("@OperateOid"),
                        operatorType.valueOf(item.getValue().valueOf("@Type")),
                        item.getValue().valueOf("@OldValue")
                ));
            }
        }

        Save(xmlPhoto, this.getRelPathByPathType(xmlType.photo));
        this.setObject2xml(xmlType.photo, ls);// ��photo���д���xml
        return true;
    }
    /*	/// <summary>
        /// ����Version���е�LastVersion����Photo��
        /// </summary>
        /// <returns>���</returns>
         public boolean setPhotoByLastVersion() {
            Document xml = this.open(xmlType.version); // ��Version������
            //��ȡ��ǰ���հ汾
            int lastVersion = Integer.parseInt(
               ((Element) xml.selectNodes("//lastVersion").get(0)).getText()
               );

            Map<String,Element> dc = new HashMap<String,Element>();// ���ڼ�¼������������Լ�xmlNode������
            //foreach (XmlElement item in xml.GetElementsByTagName("version"))
            //{
                for (int i = 0; i < lastVersion; i++)
                {
                    Element item = (Element)xml.selectNodes("//version").get(i);
                    // ����operationNode��Ĳ����ڵ�
                    for (Element operationNode : (List<Element>)item.selectNodes("./operation"))
                    {
                        String id = operationNode.valueOf("@OperateOid");
                        if (dc.containsKey(id)) {
                        // ���ֵ���ڸ�keyͬʱ�����ֵ��е�timeС���½ڵ��time�򸲸�
                        // Ȩ�޸��ҵĸ����ֵ���Ȩ�޵͵�
                        if (Integer.parseInt(dc.get(id).valueOf("@Priority")) <= Integer.parseInt(operationNode.valueOf("@Priority")))
                        {
                            if (Long.parseLong(dc.get(id).valueOf("@Time")) <= Long.parseLong(operationNode.valueOf("@Time").trim()))
                            {
                                dc.put(id, operationNode);
                            }
                        }
                        else {
                                continue;
                            }
                        }
                        dc.put(id, operationNode);// �����ֵ�
                    }

                }
            File file =new File(this.getRelPathByPathType(xmlType.photo));
            file.delete();//ֱ��ɾ���ļ��������´���һ��
            Document xmlPhoto = this.open(xmlType.photo); // ��photo������
            ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(String.valueOf(lastVersion));
            Save(xmlPhoto,this.getLocalPath(xmlType.photo));
            List<PhotoFather> ls = new ArrayList<PhotoFather>();
            for (Map.Entry<String,Element> item : dc.entrySet())// �����ֵ� ��ȡphoto����
            {
                ls.add(new PhotoFather(
                    item.getValue().valueOf("@OperateOid"),
                    operatorType.valueOf(item.getValue().valueOf("@Type")),
                    item.getValue().valueOf("@OldValue"),
                    item.getValue().valueOf("@NewValue")
                    ));
            }

            ls.size();
            this.setObject2xml(xmlType.photo, ls);// ��photo���д���xml
            return true;

        }*/
    public boolean setPhotoByLastVersion() {
        return this.setPhoto();
    }

    /// <summary>
    /// ����Version���е�LastVersion����Photo��
    /// </summary>
    /// <param name="pType">����photo������</param>
    /// <returns>���</returns>
    public boolean setPhotoByLastVersion(pathType pType)
     {
        pathType temp = this.PType;
        this.PType = pType;
        boolean result = this.setPhoto();
        this.PType = temp;
        return result;
    }

    /*
     /// <summary>
     /// ����version�������汾�Ϳ��յİ汾���׷���µĿ���
     /// </summary>
     /// <returns>���</returns>
     public boolean appendPhotoByLastVersion()
     {
         Document xmlVersion = this.open(xmlType.version); // ��Version������
         Document xmlPhoto = this.open( xmlType.photo); // ��photo������
         //��ȡ��ǰ���հ汾
         int lastVersion = Integer.parseInt(((Element)xmlVersion.selectNodes("//lastVersion").get(0)).getText());
         //��ȡphoto�а汾
         int photoVersion = Integer.parseInt(((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).getText());

         if (lastVersion == photoVersion)// �����ǰ�����°汾ֱ�ӷ���
         {
             return true;
         }


         Map<String, Element> dc = new HashMap<String, Element>();// ���ڼ�¼������������Լ�xmlNode������

         for (int i = photoVersion; i < lastVersion; i++)
         {
        	 Element item = (Element)xmlVersion.selectNodes("//version").get(i);
             // ����operationNode��Ĳ����ڵ�
             for (Element operationNode : (List<Element>)item.selectNodes("//operation"))
             {
                 String id = operationNode.valueOf("@OperateOid");
                 if (dc.containsKey(id))
                 {
                     // ���ֵ���ڸ�keyͬʱ�����ֵ��е�timeС���½ڵ��time�򸲸�
                     // Ȩ�޸��ҵĸ����ֵ���Ȩ�޵͵�
                     if (Integer.parseInt(dc.get(id).valueOf("@Priority")) <= Integer.parseInt(operationNode.valueOf("@Priority"))) {
                         if (Long.parseLong(dc.get(id).valueOf("@Time")) <= Long.parseLong(operationNode.valueOf("@Time")))
                         {
                        	 dc.put(id, operationNode);
                         }
                     }
                     else {
                         continue;
                     }
                 }
                 dc.put(id, operationNode);// �����ֵ�
             }

         }


         ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(String.valueOf(lastVersion));
         List<PhotoFather> ls = new ArrayList<PhotoFather>();
         for (Map.Entry<String,Element> item : dc.entrySet())// �����ֵ� ��ȡphoto����
         {

             ls.add(new PhotoFather(
            		 item.getValue().valueOf("@OperateOid"),
                     operatorType.valueOf(item.getValue().valueOf("@Type")),
                     item.getValue().valueOf("@OldValue"),
                     item.getValue().valueOf("@NewValue")
                     ));
         }

         List<Element> removeList = new ArrayList<Element>();
         // �����ȡ�˲����photo������Ҫ��֤photo���в����ڶ�ͬһʵ����ظ�����
         // ����ȷ��removeList
         for (Element item : (List<Element>)xmlPhoto.selectNodes("//photo"))
         {
             if (dc.containsKey(item.valueOf("@OperateOid"))) {// �������
                 removeList.add(item);
             }

         }
         for (Element item : removeList)
         {
             // �Ƴ��ýڵ�
        	 //  xmlPhoto.GetElementsByTagName("data")[0].RemoveChild(item);
        	 //������ڵ�Ϊitem���ӽڵ� ������itemƽ��
             ((Element)xmlPhoto.selectNodes("//data").get(0)).remove(item);
             // ͬʱcountҪ-1
             ((Element)xmlPhoto.selectNodes("//count").get(0)).setText(
            		 String.valueOf(Integer.parseInt((((Element)xmlPhoto.selectNodes("//count").get(0)).getText())) - 1));
         }


         Save(xmlPhoto,this.getRelPathByPathType(xmlType.photo));
         this.setObject2xml(xmlType.photo, ls);// ��photo���д���xml
         return true;

     }*/
    /// <summary>
    /// ����version�������汾�Ϳ��յİ汾���׷���µĿ���
    /// </summary>
    /// <returns>���</returns>
    public boolean appendPhotoByLastVersion()
    {
        return this.appendPhoto();
    }

    /// <summary>
    /// ����version�������汾�Ϳ��յİ汾���׷���µĿ���
    /// </summary>
    /// <param name="pType">����photo������</param>
    /// <returns>���</returns>
    public boolean appendPhotoByLastVersion(pathType pType)
    {
        pathType temp = this.PType;
        this.PType = pType;
        boolean result = this.appendPhoto();
        this.PType = temp;
        return result;
    }

    /// <summary>
    /// �汾����
    /// </summary>
    /// <param name="lastVersion">�ص��İ汾Ϊֹ</param>
    /// <returns>���</returns>
    public boolean back2Version(int lastVersion) {
        Document xml = this.open(xmlType.version);
        Element node = (Element) (xml.selectNodes("//lastVersion").get(0));

        if (String.valueOf(lastVersion).equalsIgnoreCase(node.getText()) ) {
            return true;
        }

        Document xmlPhoto = this.open(xmlType.photo);
        Element nodePhoto = (Element) xmlPhoto.selectNodes("//lastVersion").get(0);

        int count = Integer.parseInt(((Element)xml.selectNodes("//count").get(0)).getText());
        if (lastVersion > count)
        {
            lastVersion = count;
        }

        node.setText(lastVersion+" ");
        Save(xml, this.getLocalPath(xmlType.version));
        try{
            // ����ǰ汾ǰ��
            if (Integer.parseInt(nodePhoto.getText()) <= Integer.parseInt(node.getText().trim())) {
                this.appendPhotoByLastVersion(); // ����photo׷���㷨
            }else{
                // ������������photo���㷨
                this.setPhotoByLastVersion();
            }
        }catch (Exception e) {
            return false;
        }

        return true;
    }
    public boolean forward2Version(int lastVersion){
        Document version = this.open(xmlType.version);
        Document buffer = this.open(xmlType.buffer);
        List<Element> list = buffer.selectNodes("//version");
        Element parnent = version.getRootElement();
        for(Element element : list){
            parnent.add(element.createCopy());
        }
        Element count = (Element)version.selectNodes("//count").get(0);
        count.setText(version.selectNodes("//version").size()+"");
        Element lastVersionNode = (Element)version.selectNodes("//lastVersion").get(0);
        lastVersionNode.setText(lastVersion+"");
        Save(version, this.getLocalPath(xmlType.version));

        File file = new File(getRelPathByPathType(xmlType.buffer));
        file.delete();

        back2Version(lastVersion);
        setRemoveVersion2Buffer();

        return true;
    }


    /// <summary>
    /// ����������
    /// </summary>
    /// <returns>���</returns>
    public boolean setRemoveVersion2Buffer() {
        Document xml = this.open(xmlType.version);
        Element dataNode = (Element) xml.selectNodes("//data").get(0);
        Element lastVersionNode = (Element) xml.selectNodes("//lastVersion").get(0);
        Element countNode = (Element) xml.selectNodes("//count").get(0);
        int lastVersion = Integer.parseInt(lastVersionNode.getText());
        int count = Integer.parseInt(countNode.getText());

        if (lastVersion == count) return true; // ������������򷵻�

        List<Element> list = xml.selectNodes("//version");
        List<Element> removeList = new ArrayList<Element>();
        for (int i = lastVersion; i < count; i++)
        {
            // ������Ҫ�Ƴ���list����ӵ�list��
            removeList.add(list.get(i));
        }

        Document xmlBuffer =this.open(xmlType.buffer); // ��buffer
        Element parent = (Element) xmlBuffer.selectNodes("//data").get(0);
        parent.element("count").setText(removeList.size()+"");
        Element deleteNode =  this.createElementNode( parent, "delete"); // ����delete�ڵ�
         /*java.util.Date now = new java.util.Date();
 		 DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
 		 String time=format.format(now);*/
        String time = String.valueOf(System.currentTimeMillis());
        deleteNode.addAttribute("Time", time);
        //����
        deleteNode.addAttribute("UserBy", this.UserBy);
        deleteNode.addAttribute("GUID", UUID.randomUUID() + "");
        for (Element item : removeList)
        {


            // �������������node������xml�� ������importNode
            //xmlBuffer.ImportNode(item, true);// ����node �� true��ʶ�Ƿ�deep
            // ��¡�ڵ�
//        	 deleteNode.AppendChild(xmlBuffer.ImportNode(item, true)); // ��ӵ�delete�ڵ���

            deleteNode.add(item.createCopy());
        	 /*
        	 *
        	  *
        	  *
        	  *
        	  *
        	  *
        	  *
        	  * */

            dataNode.remove(item); // ɾ��Version�еļ�¼
        }
        Save(xmlBuffer,this.getRelPathByPathType(xmlType.buffer));

        countNode.setText(String.valueOf(lastVersion));
        Save(xml,this.getRelPathByPathType(xmlType.version));


        // ��version���Ƴ�removeList�е�node����ӵ�buffer��
        return true;
    }

    /// <summary>
    /// ��¡�汾�⣨��ȡ�����أ�
    /// </summary>
    /// <param name="sourceUrl">Զ�̿�·��</param>
    /// <param name="aimUrl">Ŀ���·��</param>
    /// <returns>���</returns>
    public boolean cloneByUrl(String sourceUrl, String aimUrl) throws Exception {
        //this.open(xmlType.version, aimUrl);
        //this.open(xmlType.photo, aimUrl);
        File file = new File(aimUrl);
        if (!file.exists())
        {
            file.mkdirs();
            fileCopy(sourceUrl + "\\version.xml", aimUrl + "\\version.xml");
            fileCopy(sourceUrl + "\\photo.xml", aimUrl + "\\photo.xml");

            Document xml= this.open(xmlType.version, aimUrl + "\\version.xml");
            String lastVersion = ((Element)xml.selectNodes("//lastVersion").get(0)).getText();
            String number = ((Element)xml.selectNodes("//number").get(0)).getText();

            Document xml2 = this.open(xmlType.setting, aimUrl + "\\setting.xml");
            ((Element)xml2.selectNodes("//origin").get(0)).setText(sourceUrl);
            ((Element)xml2.selectNodes("//slastVersion").get(0)).setText(lastVersion);
            ((Element)xml2.selectNodes("//snumber").get(0)).setText(number);
            Save(xml2,aimUrl + "\\setting.xml");
            return true;
        }
        else {
            throw new Exception("Ŀ����Ѵ��ڣ�������ѡ��·��");

        }
    }
    //�ļ��ܵ����Ʒ���
    //��Ҫ�����������ַ�����Դ�ļ�·��+���֣�Ŀ��·��+���֣�
    public void fileCopy(String source, String target) {
        File s = new File(source);
        File t = new File(target);
        FileInputStream fi = null;
        FileOutputStream fo = null;
        FileChannel in = null;
        FileChannel out = null;
        try {
            fi = new FileInputStream(s);
            fo = new FileOutputStream(t);
            in = fi.getChannel();//�õ���Ӧ���ļ�ͨ��
            out = fo.getChannel();//�õ���Ӧ���ļ�ͨ��
            in.transferTo(0, in.size(), out);//��������ͨ�������Ҵ�inͨ����ȡ��Ȼ��д��outͨ��
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fi.close();
                in.close();
                fo.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /// <summary>
    /// ���Ͱ汾����Դ����⣨������ȡʱ��setting��
    /// </summary>
    /// <returns></returns>
    public boolean pushBySetting() throws Exception {
        // �򿪱��ؿ�setting
        Document settingXml = this.open(xmlType.setting);
        Element element = ((Element)settingXml.selectNodes("//origin").get(0));
        System.out.println(element.getName() +"   url:"+element.getText());
        String sourceUrl =  ((Element)settingXml.selectNodes("//origin").get(0)).getText();   // Զ�̿�·��
        int slastVersion = Integer.parseInt(((Element)settingXml.selectNodes("//slastVersion").get(0)).getText());  // Զ�̿���ȡʱ�汾
        int snumber = Integer.parseInt(((Element)settingXml.selectNodes("//snumber").get(0)).getText());

        // �򿪱��ؿ�version
        Document localVersionXml = this.open(xmlType.version);
        Node localDataNode = localVersionXml.selectSingleNode("data");
        int localNum = Integer.parseInt(localDataNode.selectSingleNode("number").getText());
        int localVersion = Integer.parseInt(localDataNode.selectSingleNode("lastVersion").getText());

        if (localNum < snumber)
        {
            throw new Exception("������ύ���汾��ƥ��");
        }
        else if (localNum == snumber)
        {
            // ��ΰ汾��ͬ�������ύ
            return true;
        }

        // ����汾��������
        // ������µĲ�ֵ
        List<Element> list =  localDataNode.selectNodes("//version");
        List<Element> localUpdateList = new ArrayList<Element>(); // ���ظ��µ�����
        for (int i = snumber; i < list.size(); i++) // �����
        {
            localUpdateList.add(list.get(i));
        }

        // ��Զ�̿�
        Document globalVersionXml = this.open(xmlType.version, sourceUrl+"version.xml");
        Element globalDataNode =  (Element) globalVersionXml.selectSingleNode("data");
        int globalNum = Integer.parseInt(globalDataNode.selectSingleNode("number").getText());
        int globalVersion = Integer.parseInt(globalDataNode.selectSingleNode("lastVersion").getText());

        List<Element> list2 = globalDataNode.selectNodes("//version");
        List<Element> globalUpdateList = new ArrayList<Element>(); // �������µ�����
        for (int i = snumber; i < list2.size(); i++)
        {
            globalUpdateList.add(list2.get(i));
        }
        // ���������������ʱû�������汾����
        if (globalUpdateList.size() == 0) {
            // ֱ�ӽ��µİ汾�ۼӵ��汾����
            for (Element item : localUpdateList)
            {
                //globalDataNode.AppendChild(globalVersionXml.ImportNode(item,true)); // ���ڵ㸴��
                globalDataNode.add(item.createCopy());
                /**
                 *
                 *
                 *
                 *
                 *
                 *
                 *
                 *
                 * */
            }
            int increment = localUpdateList.size();
            // �洢Զ��version��
            globalDataNode.selectSingleNode("number").setText(String.valueOf(globalNum + increment));
            globalDataNode.selectSingleNode("lastVersion").setText(String.valueOf(globalVersion + increment));
            globalDataNode.selectSingleNode("count").setText(String.valueOf((Integer.parseInt(globalDataNode.selectSingleNode("count").getText())+increment)));
            Save(globalVersionXml, sourceUrl + "version.xml");
            // ����Զ�̿���
            // ����ҵ���߼�����

            // �洢����setting
            ((Element)settingXml.selectNodes("//slastVersion").get(0)).setText(String.valueOf(slastVersion + increment));
            ((Element)settingXml.selectNodes("//snumber").get(0)).setText(String.valueOf(snumber + increment));
            Save(settingXml,getRelPathByPathType(xmlType.setting));
        }
        else // ***���������������ʱ�������汾���£����ڰ汾��ͻ�������
        {
            //foreach (XmlNode item in localUpdateList)
            //{
            //    globalVersionXml.ImportNode(item, true); // ���ڵ㸴��
            //}
            Map<String, List<Element>> localDc = new HashMap<String, List<Element>>();
            Map<String, List<Element>> globalDc = new HashMap<String, List<Element>>();
            for (Element item : localUpdateList)
            {
                for (Element operation : (List<Element>)item.selectNodes("//operation"))
                {
                    String oid = operation.valueOf("@OperateOid");
                    if (localDc.containsKey(oid))// �����
                    {
                        localDc.get(oid).add(operation);
                    }
                    else// �粻����key���ʼ��
                    {
                        localDc.put(oid, new ArrayList<Element>());
                        localDc.get(oid).add(operation);
                    }
                }
            }
            for (Element item : globalUpdateList)
            {
                for (Element operation : (List<Element>)item.selectNodes("//operation"))
                {
                    String oid = operation.valueOf("@OperateOid");
                    if (globalDc.containsKey(oid))// �����
                    {
                        globalDc.get(oid).add(operation);
                    }
                    else// �粻����key���ʼ��
                    {
                        globalDc.put(oid, new ArrayList<Element>());
                        globalDc.get(oid).add(operation);
                    }
                }
            }
            // �洢��ͻ�Ĳ���id
            List<String> conflictList = new ArrayList<String>();
            for (Map.Entry<String,List<Element>> value : localDc.entrySet())
            {
                if (globalDc.containsKey(value.getKey())) {// ����ڳ�ͻ
                    // �����ͻ����
                    conflictList.add(value.getKey());
                }
            }

            // ***�洢ɾ���ĳ�ͻ�ڵ�
            List<Element> removeNodeList = new ArrayList<Element>();

            for (String item : conflictList)
            {
                // ���local�ֵ��д���item���Ƴ�
                if (localDc.containsKey(item)) {
                    // �����������List<XmlNode>
                    for (Element node : localDc.get(item))
                    {
                        removeNodeList.add(node.createCopy());

                        //foreach (XmlNode version in localUpdateList)
                        //{
                        //    // �Ƴ��ڵ�
                        //    try
                        //    {
                        //        removeNodeList.Add(version.RemoveChild(node));
                        //    }
                        //    catch
                        //    {
                        //        continue;
                        //    }
                        //}
                    }
                }

                // ���global�ֵ��д���item���Ƴ�
                if (globalDc.containsKey(item)) {
                    // �����������List<XmlNode>
                    for (Element node : globalDc.get(item))
                    {
                        removeNodeList.add(node.createCopy());
                        //foreach (XmlNode version in globalUpdateList)
                        //{
                        //    // �Ƴ��ڵ�
                        //    try
                        //    {
                        //        removeNodeList.Add(version.RemoveChild(node));
                        //    }
                        //    catch
                        //    {
                        //        continue;
                        //    }
                        //}
                    }
                }
            }// �Ƴ��ڵ����

            // ��ʱ��removeNodeList��¼�����еĳ�ͻ����������updateList�еĳ�ͻ�ڵ����Ƴ�
            List<Element> conflictResList = new ArrayList<Element>(); // ���ڳ�ͻ���������
            // ������ͻ��õ�operation��������
            List<Element> updateOperationList = new ArrayList<Element>();
            String last="";
            for (Element item : removeNodeList)
            {
                String oid = item.valueOf("@OperateOid");
                if (last == "") last = oid;
                if (last == oid) {
                    conflictResList.add(item);
                }
                else // �粻��ͬ��ʾͬһid�ĳ�ͻ��������
                {
                    // ��ͻ��������ϲ���Ĳ�������
                    updateOperationList.add(conflicRes(conflictResList));
                    conflictResList = new ArrayList<Element>();
                    conflictResList.add(item);
                    last = oid;
                }
            }

            // updateOperationListΪXmlNode���ϣ���ʱ��ͻ�������
            // �����ؿ�汾�Ƶ�Զ�̰汾��
            // ֱ�ӽ��µİ汾�ۼӵ��汾����
            for (Element item : localUpdateList)
            {
                ((Element)item).addAttribute("num", (++globalNum) + "");
                //globalDataNode.AppendChild(globalVersionXml.ImportNode(item, true)); // ���ڵ㸴��
                globalDataNode.add(item.createCopy());
                 /*
                  *
                  *
                  *
                  *
                  *
                  *
                  *
                  *
                  *
                  * */
            }
            int increment = localUpdateList.size();
            // �洢Զ��version��
            globalDataNode.selectSingleNode("number").setText(String.valueOf(globalNum));
            globalDataNode.selectSingleNode("lastVersion").setText(String.valueOf(globalVersion + increment));
            globalDataNode.selectSingleNode("count").setText(String.valueOf(Integer.parseInt(globalDataNode.selectSingleNode("count").getText()) + increment)) ;
            for (Element item : updateOperationList)
            {
                ((Element)globalDataNode).add(item);
            }

            List<Element> lastchildlist = globalDataNode.elements();
            Element lastchild = lastchildlist.get(lastchildlist.size()-1);
            List<Element> firstchildlist = lastchild.elements();
            Element firstchild = firstchildlist.get(0);
            firstchild.setText(String.valueOf(Integer.parseInt(firstchild.getText())+updateOperationList.size()));
            Save(globalVersionXml, sourceUrl + "version.xml");

            // �Ƴ�ԭ�ȵİ汾�ڵ㣬ͬ���������İ汾
            // �Ƴ�ԭ�ȵ�data�ڵ�
            localVersionXml.remove(localDataNode);
            // ��ֲ������data�ڵ�
            //localVersionXml.AppendChild(localVersionXml.ImportNode(globalDataNode, true));
            localVersionXml.add(globalDataNode.createCopy());
             /*
              *
              *
              *
              *
              *
              *
              * */
            Save(localVersionXml,this.getRelPathByPathType(xmlType.version));

            ((Element)settingXml.selectNodes("//slastVersion").get(0)).setText(globalDataNode.selectSingleNode("lastVersion").getText());;
            ((Element)settingXml.selectNodes("//snumber").get(0)).setText(globalDataNode.selectSingleNode("number").getText());
            Save(settingXml, getRelPathByPathType(xmlType.setting));

            this.setPhotoByLastVersion();
        }
        return true;
    }

    /// <summary>
    /// ��ͻ����
    /// </summary>
    /// <param name="list"></param>
    /// <returns></returns>
    public Element conflicRes(List<Element> list) {
        //Console.WriteLine( ((XmlElement)list[0].ParentNode).GetAttribute("Priority"));
        List<String> priority = new ArrayList<String>();
        for (Element item : list)
        {
            String p = ((Element)item.getParent()).valueOf("@Priority");
            if (priority.contains(p))
            {
                // ��ʾ����Ȩ�޳�ͻ������һ�Բ����г�ͻ��
                // ����Զ��ϲ���Ч���ֶ��ϲ�
                return conflictResByAdmin(list);
            }
            else {
                priority.add(p);
            }
        }
        return conflicResAuto(list);
    }
    /// <summary>
    /// ��ͻ�Զ�����
    /// </summary>
    /// <param name="list"></param>
    /// <returns></returns>
    public Element conflicResAuto(List<Element> list) {
        return list.get(0);
    }
    /// <summary>
    /// ��ͻͨ��admin����
    /// </summary>
    /// <param name="list"></param>
    /// <returns></returns>
    public Element conflictResByAdmin(List<Element> list) {
        System.out.println("���ڳ�ͻ��Ŀ����"+list.size());
        int count = 1;
        int flag;
        for (Element item : list)
        {
            System.out.println(count+ "����ͻ"+count++ + "�ǣ�" + item.valueOf("@Oid")+":"+item.valueOf("@Type")+","+item.valueOf("@OldValue")+","+item.valueOf("@NewValue"));
        }
        while (true) {
            System.out.println("��������ɵĲ�����");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextInt();
            if(flag<=list.size()) break;
        }
        ((Element)(list.get(flag - 1))).addAttribute("Priority", "5");
        return list.get(flag-1);
    }


    /// <summary>
    /// ����setting�е�origin��ȡ���°汾
    /// </summary>
    public boolean pullFromOrigin() {
        try{
            // �򿪱��ؿ�setting
            Document settingXml = this.open(xmlType.setting);
            String sourceUrl = ((Element)settingXml.selectNodes("//origin").get(0)).getText();   // Զ�̿�·��
            String snumber = ((Element)settingXml.selectNodes("//snumber").get(0)).getText();
            // ��Զ�̿�
            Document globalVersionXml = this.open(xmlType.version, sourceUrl + "version.xml");
            Element globalDataNode = (Element) globalVersionXml.selectSingleNode("data");
            String globalNum =globalDataNode.selectSingleNode("number").getText();
            String globalVersion = globalDataNode.selectSingleNode("lastVersion").getText();
            // �������Ҫpull��
            if (snumber == globalNum) return true;
            // �򿪱��ؿ�version
            Document localVersionXml = this.open(xmlType.version);
            Element localDataNode = (Element) localVersionXml.selectSingleNode("data");

            // ���±��ذ汾��
            localVersionXml.remove(localDataNode);
            //  localVersionXml.AppendChild(localVersionXml.ImportNode(globalDataNode,true));
            localVersionXml.add(globalDataNode.createCopy());
         /*
          *
          *
          *
          *
          *
          * */
            Save(localVersionXml,this.getRelPathByPathType(xmlType.version));
            // ����setting
            ((Element)settingXml.selectNodes("//slastVersion").get(0)).setText(globalVersion);
            ((Element)settingXml.selectNodes("//snumber").get(0)).setText(globalNum);
            Save(settingXml,this.getRelPathByPathType(xmlType.setting));
            // ���ÿ���
            this.appendPhotoByLastVersion();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    /// <summary>
    /// �������õ�·����ȡPhoto�б�
    /// </summary>
    /// <returns>photo���������</returns>
    public List<PhotoFather> getPhotoList() throws Exception
    {
        List<PhotoFather> list = new ArrayList<PhotoFather>();
        Document xml = this.open(xmlType.photo);
        Element dataNode = (Element)xml.selectSingleNode("data");
        for (Element item : (List<Element>)dataNode.selectNodes("photo"))
        {
            if (item.valueOf("@Type").equalsIgnoreCase("Add" )|| item.valueOf("@Type").equalsIgnoreCase("Modify"))
            {
                PhotoFather photo = new PhotoFather(
                        item.valueOf("@OperateOid"),
                        operatorType.valueOf(item.valueOf("@Type")),
                        item.valueOf("@NewValue")
                );
                if (item.valueOf("@Type").equalsIgnoreCase("Add")) {
                    photo.setAddOrDelObject(this.deSerialize(item.valueOf("@NewValue")));
                }
                list.add(photo);
            }
            else if (item.valueOf("@Type").equalsIgnoreCase("Delete"))
            {
                PhotoFather photo = new PhotoFather(
                        item.valueOf("@OperateOid"),
                        operatorType.valueOf(item.valueOf("@Type")),
                        item.valueOf("@OldValue")
                );
                photo.setAddOrDelObject(this.deSerialize(item.valueOf("@OldValue")));
                list.add(photo);
            }
        }
        return list;
    }

    /// <summary>
    /// ��ȡVersion����ȫ����versionlist
    /// </summary>
    /// <returns>versionlist���б�</returns>
    public List<OVersion> getVersionList() throws Exception
    {
        List<OVersion> list = new ArrayList<OVersion>();
        Document xml = this.open(xmlType.version);
        Element dataNode = (Element)xml.selectSingleNode("data");
        for (Element item : (List<Element>)dataNode.selectNodes("version"))
        {
            List<OperationFather> subList = new ArrayList<OperationFather>();
            // ������ȡversion�е�operation
            for (Element operationNode : (List<Element>)item.selectNodes("operation"))
            {
                OperationFather operation = new OperationFather(
                        operationNode.valueOf("@OperateOid"),
                        operatorType.valueOf(operationNode.valueOf("@Type")),
                        Long.parseLong(operationNode.valueOf("@Time")),
                        operationNode.valueOf("@OldValue"),
                        operationNode.valueOf("@NewValue"),
                        operationNode.valueOf("@Oid")
                );
                if (operationNode.valueOf("@Type").equalsIgnoreCase("Add") )
                {
                    operation.setAddOrDelObject(this.deSerialize(operationNode.valueOf("@NewValue")));
                }
                if (operationNode.valueOf("@Type").equalsIgnoreCase("Delete"))
                {
                    operation.setAddOrDelObject(this.deSerialize(operationNode.valueOf("@OldValue")));
                }
                subList.add(operation);
            }
            // ���������ȡ����version
            list.add(new OVersion(
                            subList,
                            Long.parseLong(item.valueOf("@Time")),
                            item.valueOf("@Description"),
                            item.valueOf("@UserBy"),
                            item.valueOf("@Email"),
                            priorityType.valueOf(item.valueOf("@Priority"))
                    )
            );
        }
        return list;
    }

    public List<OVersion> getVersionList(int rangeL,int rangR) throws Exception
    {
        List<OVersion> list = new ArrayList<OVersion>();
        Document xml = this.open(xmlType.version);
        Element dataNode = (Element)xml.selectSingleNode("data");
        List<Element> versionList = dataNode.selectNodes("version");
        if (rangeL < 0) rangeL = 0;
        if (rangR > versionList.size()) rangR = versionList.size();
        for(int i= rangeL;i< rangR; i++)
        {
            Element item = (Element)versionList.get(i);
            List<OperationFather> subList = new ArrayList<OperationFather>();
            // ������ȡversion�е�operation
            for (Element operationNode : (List<Element>)item.selectNodes("operation"))
            {
                OperationFather operation = new OperationFather(
                        operationNode.valueOf("@OperateOid"),
                        operatorType.valueOf(operationNode.valueOf("@Type")),
                        Long.parseLong(operationNode.valueOf("@Time")),
                        operationNode.valueOf("@OldValue"),
                        operationNode.valueOf("@NewValue"),
                        operationNode.valueOf("@Oid")
                );
                if (operationNode.valueOf("@Type") == "Add")
                {
                    operation.setAddOrDelObject(this.deSerialize(operationNode.valueOf("@NewValue")));
                }
                if (operationNode.valueOf("@Type") == "Delete")
                {
                    operation.setAddOrDelObject(this.deSerialize(operationNode.valueOf("@OldValue")));
                }
                subList.add(operation);
            }
            // ���������ȡ����version
            list.add(new OVersion(
                    subList,
                    Long.parseLong(item.valueOf("@Time")),
                    item.valueOf("@Description"),
                    item.valueOf("@UserBy"),
                    item.valueOf("@Email"),
                    priorityType.valueOf(item.valueOf("@Priority"))
            ));
        }
        return list;
    }

    /// <summary>
    /// ��ȡOperation���е�operationlist
    /// </summary>
    /// <returns>��ǰ�������У�δ�ύ��</returns>
    public List<OperationFather> getOperationList() throws Exception
    {
        List<OperationFather> list = new ArrayList<OperationFather>();
        Document xml = this.open(xmlType.operation);
        Element dataNode = (Element)xml.selectSingleNode("data");
        for (Element item : (List<Element>)dataNode.selectNodes("operation"))
        {
            OperationFather operation = new OperationFather(
                    item.valueOf("@OperateOid"),
                    operatorType.valueOf(item.valueOf("@Type")),
                    Long.parseLong(item.valueOf("@Time")),
                    item.valueOf("@OldValue"),
                    item.valueOf("@NewValue"),
                    item.valueOf("@Oid")
            );
            if (item.valueOf("@Type") == "Add")
            {
                operation.setAddOrDelObject(this.deSerialize(item.valueOf("@NewValue")));
            }
            if (item.valueOf("@Type") == "Delete")
            {
                operation.setAddOrDelObject(this.deSerialize(item.valueOf("@OldValue")));
            }
            list.add(operation);
        }
        return list;
    }

    /// <summary>
    /// ��ȡ��ǰ�汾λ��
    /// </summary>
    /// <param name="xType">�ĵ�����</param>
    /// <returns>�汾λ��</returns>
    public int getLastVersion(xmlType xType) throws Exception
    {
        if (xType == xmlType.operation || xType == xmlType.buffer || xType == xmlType.setting)
        {
            throw new Exception("can not get lastVersion by" + xType.toString()+", just can get it by version or photo");
        }
        Document xml = this.open(xType);
        Element dataNode = (Element)xml.selectSingleNode("data");
        return Integer.parseInt(dataNode.selectSingleNode("lastVersion").getText());
    }

    /// <summary>
    /// ���л�������ַ���
    /// </summary>
    /// <param name="obj">��Ҫ���л��Ķ���</param>
    /// <returns>���л�����ַ���</returns>
    public String serialize(Object obj) throws Exception
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        String serStr = byteArrayOutputStream.toString("ISO-8859-1");//������ISO-8859-1
        serStr = java.net.URLEncoder.encode(serStr, "UTF-8");//������ַ����������루����Ҳ��Ӱ�칦�ܣ�
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return serStr;
    }

    /// <summary>
    /// �����л�����
    /// </summary>
    /// <param name="objStr">�����л��Ķ���string���ͣ�</param>
    /// <returns>����</returns>
    public Object deSerialize(String serStr) throws Exception
    {
        String redStr = java.net.URLDecoder.decode(serStr, "UTF-8");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(redStr.getBytes("ISO-8859-1"));
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object obj = objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        return obj;
    }
}

