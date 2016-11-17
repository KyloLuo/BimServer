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
    /// 获取项目库路径
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
    /// 实例化DAL类
    /// </summary>
    /// <param name="url">数据库目录</param>
    /// <param name="userBy">作者</param>
    /// <param name="projectId">项目id</param>
    /// <param name="pType">路径类型（中央库或本地库）</param>
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

        // 操作本地库时才初始化本地路径
        if (Integer.parseInt(pType.toString()) == 0)
        {
            this.initLocalPath();
        }
        else
        {
            // 操作中央库时才初始化中央库
            this.initGlobalPath();
        }
    }
    // <summary>
    // 实例化DAL类(无userBy,只用于初始化版本库或克隆库时使用)
    // </summary>
    // <param name="url">数据库目录</param>
    // <param name="projectId">项目id</param>
    // <param name="ptype">操作路径类型</param>
    public DAL(String url, String projectId, pathType ptype)
    {
        this.BaseUrl = url;
        this.ProjectId = projectId;
        this.PType = ptype;
        this.initGlobalPath();
    }

    // <summary>
    // 初始化本地版本库路径
    // </summary>
    public void initLocalPath() {
        String url = this.getProjectUrl() + "\\"+this.UserBy+"\\";
        File file = new File(url);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
    // <summary>
    // 初始化中央版本库路径
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
    // 获取版本库路径（根据项目id，userby）
    // </summary>
    // <returns>url</returns>
    public String getLocalPath()
    {
        return getProjectUrl() + "\\" + this.UserBy + "\\";
    }
    // <summary>
    // 获取中央版本库路径（根据项目id，userby）
    // </summary>
    // <returns>url</returns>
    public String getGlobalPath()
    {
        return getProjectUrl() + "\\Glabal\\";
    }

    // <summary>
    // 根据输入获取完整的xml路径（本地版本库）
    // </summary>
    // <param name="type">操作类型</param>
    // <returns>完整的xml路径（本地版本库）</returns>
    public String getLocalPath(xmlType type) {
        return getProjectUrl() + "\\" + this.UserBy + "\\" + type.toString() + ".xml";
    }
    // <summary>
    // 根据输入获取完整的xml路径（中央版本库）
    // </summary>
    // <param name="type">操作类型</param>
    // <returns></returns>
    public String getGlobalPath(xmlType type) {
        return getProjectUrl() + "\\Glabal\\"+type.toString()+".xml";
    }
    // <summary>
    // 根据路径类型获取路径
    // </summary>
    // <param name="type">库类型</param>
    // <returns></returns>
    public String getRelPathByPathType(xmlType type) {
        return Integer.parseInt(this.PType.toString()) == 0 ? this.getLocalPath(type) : this.getGlobalPath(type);
    }
    //测试通过 by ljn
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
    /// 打开xml连接
    /// </summary>
    /// <param name="type">打开文件的类型</param>
    /// <returns>XmlDocument对象</returns>
    // 测试通过 by ljn
    public Document open(xmlType type) {
        String url = getRelPathByPathType(type);
        return this.getXmlDc(type, url);
    }
    /// <summary>
    /// 打开xml连接
    /// </summary>
    /// <param name="type">xml类型</param>
    /// <param name="url">完整路径</param>
    /// <returns>XmlDocument对象</returns>
    public Document open(xmlType type, String url) {
        return this.getXmlDc(type, url);
    }
    /// <summary>
    /// 用于open方法，根据xmlType和url确定路径
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
                // 表克隆库的远程路径
                this.createElement(data, "origin", "");
                //data.addElement("origin").setText("");
                // 表克隆瞬时远程库的版本
                this.createElement(data, "slastVersion", "0");
                //data.addElement("slastVersion").setText("0");
                // 克隆瞬时远程库的版本总数
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
    /// xml创建元素
    /// </summary>
    /// <param name="xml">xml对象</param>
    /// <param name="parent">父节点</param>
    /// <param name="childType">子节点类型</param>
    /// <param name="txt">子节点内容</param>
    //	测试通过 by ljn
    public void createElement(Element element, String childType, String txt)
    {
        element.addElement(childType).setText(txt);
    }

    /// <summary>
    /// xml创建元素
    /// </summary>
    /// <param name="xml">xml对象</param>
    /// <param name="parent">父节点</param>
    /// <param name="childType">子节点</param>
    /// <returns>创建的对象</returns>
    //	测试通过 by ljn
    public Element createElementNode(Element parent, String childType)
    {
        Element element = parent.addElement(childType);
        return element;
    }
    /// <summary>
    /// xml创建元素
    /// </summary>
    /// <param name="xml">xml对象</param>
    /// <param name="parent">父节点</param>
    /// <param name="childType">子节点</param>
    /// <param name="innerText">值</param>
    /// <returns>创建的对象</returns>
    //	测试通过 by ljn
    public Element createElementNode(Element parent, String childType, String innerText)
    {
        Element element = this.createElementNode(parent, childType);
        element.setText(innerText);
        return element;
    }
    /// <summary>
    /// 设置node值
    /// </summary>
    /// <param name="node">node节点</param>
    /// <param name="value">值</param>
    //	测试通过 by ljn
    public void setValue(Element element, String value) {
        element.setText(value);
    }

    /// <summary>
    /// 将object存入xml
    /// </summary>
    /// <param name="type">object类型</param>
    /// <param name="obj">object</param>
    /// <returns>处理结果</returns>
    public boolean setObject2xml(xmlType xmlType,Object obj) {
        String url = getRelPathByPathType(xmlType);
        Document xml = this.open(xmlType);
        //获取根节点
        Element root = xml.getRootElement();
        //增加count值
        Element countNode = (Element) xml.selectNodes("//count").get(0);
        int count = Integer.parseInt(countNode.getText());

        //添加节点
        if (obj instanceof OperationFather /*|| ((ArrayList)obj).get(0) instanceof OperationFather*/) // 如果传入是操作对象
        {
            boolean flag = true; // 是否存储当前存入的Operation
            OperationFather operation = (OperationFather)obj;

            //List<XmlElement> removeList = new List<XmlElement>();//存放移除序列
            List<Element> removeList = new ArrayList<Element>(); // 待移除的序列

            //消除对同一实体的操作，只保留最新操作
            //目前只对操作属性的操作自动合并（存入操作库中时）
            if (operation.getOperatorType().toString().equalsIgnoreCase("Modify")) {
                for(Object item : xml.selectNodes("//"+xmlType.toString()))
                {
                    Element node = (Element)item;
                    if (node.attributeValue("OperateOid") == operation.getOperateOid() && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type").equalsIgnoreCase("Modify"))
                    {
                        // node是xml里面的
                        // operation是传入的
                        // removeList.Add(node);


                        // 原始：
                        //removeNode = node;
                        //count -= 1;
                        //this.setValue(countNode, count + "");

                        //改
                        if(node.attributeValue("OldValue")!= operation.getValue().getNewValue()
                                && node.attributeValue("NewValue")==operation.getValue().getOldValue())
                        {
                            // 旧新操作初末值不一样, 且末初值相同
                            // 即 1->2, 2->3 //  反例：1->2, 3->5
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
                    // 实体操作为delete 且同一版本未提交前有添加操作
                    if ((node.attributeValue("OperateOid") == operation.getOperateOid() && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type") == "Add")
                            || (node.attributeValue("OperateOid").contains(operation.getOperateOid()+":") && Long.parseLong(node.attributeValue("Time")) <= operation.getTime() && node.attributeValue("Type") == "Modify"))
                    {
                        removeList.add(node);
                        count--;
                        this.setValue(countNode, count + "");
                        if (node.attributeValue("Type") == "Add")
                        {
                            flag = false;// 不存入该operation
                        }
                    }

                }
            }

            // 移除需移除的节点
            if (removeList.size()>0) {
                for (Element item : removeList)
                {
                    root.remove(item);
                }
            }

            // 存储node
            if (flag) {
                this.setValue(countNode, (count + 1) + "");
                setAttributeByObject(this.createElementNode(root, xmlType.toString()), operation);
            }
        /*    OperationFather operation = (OperationFather)obj;

            //List<XmlElement> removeList = new List<XmlElement>();//存放移除序列
            Element removeNode = null;// 存放移除对象

            //消除对同一实体的操作，只保留最新操作
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
						//添加检测oldValue与newValue相等情况  以及增加删除同一实体

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
        else if (obj instanceof OVersion) // 如果传入是版本对象
        {
            Element numNode = (Element) xml.selectNodes("//number").get(0); // 获取总的版本数目
            int num = Integer.parseInt(numNode.getText())+1;

            Element lastVersion = (Element) xml.selectNodes("//lastVersion").get(0);
            this.setValue(lastVersion, (Integer.parseInt(lastVersion.getText())+1) + "");
            OVersion vs = (OVersion)obj;
            this.setValue(countNode, (count + 1) + "");
            Element node = this.createElementNode(root, xmlType.toString());
            this.setAttributeByObject(node, vs, xml, num+"");
            this.setValue(numNode,  num+ "");
        }
        else if (obj instanceof PhotoFather || ((ArrayList)obj).get(0) instanceof PhotoFather) {  // 如果传入是快照集合
            for (PhotoFather item : (List<PhotoFather>)obj)
            {
                count += 1;
                Element node = this.createElementNode(root, "photo");
                this.setAttributeByObject(node, item); // 设置传入的对象属性
            }
            this.setValue(countNode, count+"");
        }
        Save(xml, url);
        return true;

    }

    /// <summary>
    /// 根据Operation设置属性
    /// </summary>
    /// <param name="node">父节点</param>
    /// <param name="operation">操作</param>
    public void setAttributeByObject(Element node, OperationFather operation) {

        node.addAttribute("Oid", operation.getOid());
        node.addAttribute("OperateOid", operation.getOperateOid());
        node.addAttribute("Type", operation.getOperatorType().toString());
        node.addAttribute("Time", String.valueOf(operation.getTime()));
        node.addAttribute("OldValue", operation.getValue().getOldValue());
        node.addAttribute("NewValue", operation.getValue().getNewValue());
    }
    /// <summary>
    /// 根据Version设置属性
    /// </summary>
    /// <param name="node">父节点</param>
    /// <param name="vs">OVersion</param>
    /// <param name="num">version的计数</param>
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
    /// 根据快照设置属性
    /// </summary>
    /// <param name="node">父节点</param>
    /// <param name="photo">快照对象</param>
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
    /// 清空Operation
    /// </summary>
    /// <returns>结果</returns>
    public boolean clearOperation() {
        File file = new File(getRelPathByPathType(xmlType.operation));//直接删除文件，再重新创建一个
        file.delete();
        Document xml = this.open(xmlType.operation);
        return true;
    }

    /// <summary>
    /// 内部调用用（重置快照）
    /// </summary>
    /// <returns></returns>
    private boolean setPhoto() {
        Document xml = this.open(xmlType.version); // 打开Version的连接
        //获取当前最终版本
        int lastVersion =Integer.parseInt(
                ((Element) xml.selectNodes("//lastVersion").get(0)).getText()
        );

        Map<String, Element> dc = new HashMap<String, Element>();// 用于记录被操作对象的以及xmlNode的引用
        List<String> nodeIDForRemove = new ArrayList<String>();

        for (int i = 0; i < lastVersion; i++)
        {
            Element item = (Element)xml.selectNodes("//version").get(i);
            // 遍历operationNode里的操作节点
            for (Element operationNode : (List<Element>)item.selectNodes("./operation"))
            {
                String id = operationNode.valueOf("@OperateOid");
                if (dc.containsKey(id))
                {
                    // 如字典存在该key同时满足字典中的time小于新节点的time则覆盖(即初末值合并)
                    // 权限高且的覆盖字典中权限低的
                    if ( Integer.parseInt(dc.get(id).valueOf("@Priority")) <=  Integer.parseInt(operationNode.valueOf("@Priority")))
                    {
                        if (Long.parseLong(dc.get(id).valueOf("@Time")) <= Long.parseLong(operationNode.valueOf("@Time").trim()))
                        {
                            // 原始
                            // dc[id] = operationNode;

                            // 修改后
                            if (operationNode.valueOf("@Type").equalsIgnoreCase("Modify"))
                            {
                                dc.put(id, operationNode);
                            }
                            else if (operationNode.valueOf("@Type").equalsIgnoreCase("Delete"))
                            {
                                /** nodeIDForRemove.add(id);
                                 var nodeForRemove = from d in dc where d.Key.StartsWith(id + ":") select d;
                                 // 模糊匹配到所有需要移除的属性及添加等节点
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
                    // 不存在key则存入
                    dc.put(id, operationNode);// 存入字典
                }
            }
        }
        // 遍历结束
        for (String nodeId : nodeIDForRemove)
        {
            dc.remove(nodeId);
        }
        File file = new File(this.getRelPathByPathType(xmlType.photo));
        file.delete();//直接删除文件，再重新创建一个
        Document xmlPhoto = this.open(xmlType.photo); // 打开photo的连接
        int count = Integer.parseInt(((Element)xmlPhoto.selectNodes("//count").get(0)).getText());
        ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(lastVersion+"");
        Save(xmlPhoto,this.getLocalPath(xmlType.photo));
        List<PhotoFather> ls = new ArrayList<PhotoFather>();
        for (Map.Entry<String, Element> item : dc.entrySet())// 遍历字典 提取photo对象
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


        this.setObject2xml(xmlType.photo, ls);// 将photo序列存入xml
        return true;
    }
    /// <summary>
    /// 内部调用用（追加快照）
    /// </summary>
    /// <returns></returns>
    private boolean appendPhoto()
    {
        Document xmlVersion = this.open(xmlType.version); // 打开Version的连接
        Document xmlPhoto = this.open(xmlType.photo); // 打开photo的连接
        //获取当前最终版本
        int lastVersion = Integer.parseInt(((Element)xmlVersion.selectNodes("//lastVersion").get(0)).getText());
        //获取photo中版本
        int photoVersion = Integer.parseInt(((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).getText());

        if (lastVersion == photoVersion)// 如果当前是最新版本直接返回
        {
            return true;
        }


        Map<String, Element> dc = new HashMap<String, Element>();// 用于记录被操作对象的以及xmlNode的引用
        List<String> nodeIDForRemove = new ArrayList<String>();// 待移除节点
        for (Element item : (List<Element>)xmlPhoto.selectNodes("//photo"))
        {
            dc.put(item.attributeValue("OperateOid"), item);
        }


        // 移除原有photo中的节点
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
            // 遍历operationNode里的操作节点
            for (Element operationNode : (List<Element>)item.selectNodes("operation"))
            {
                String id = operationNode.valueOf("@OperateOid");
                if (dc.containsKey(id))
                {
                    // 如字典存在该key同时满足字典中的time小于新节点的time则覆盖
                    // 权限高且的覆盖字典中权限低的
                    //if (Convert.ToInt32(dc[id].GetAttribute("Priority")) <= Convert.ToInt32(operationNode.GetAttribute("Priority"))) {
                    //   if (Convert.ToInt32(dc[id].GetAttribute("Time")) <= Convert.ToInt32(operationNode.GetAttribute("Time")))
                    if (true)
                    {
                        if (true)
                        {
                            // 原始
                            // dc[id] = operationNode;

                            // 修改后
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
                                // 模糊匹配到所有需要移除的属性及添加等节点
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
                    dc.put(id, operationNode);// 存入字典
                }
            }

        }

        // 移除dc中被删除的element及其属性
        for (String nodeId : nodeIDForRemove)
        {
            dc.remove(nodeId);
        }

        ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(lastVersion+"");
        List<PhotoFather> ls = new ArrayList<PhotoFather>(); // dc的value转成photo序列
        for (Map.Entry<String, Element> item : dc.entrySet())// 遍历字典 提取photo对象
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
        this.setObject2xml(xmlType.photo, ls);// 将photo序列存入xml
        return true;
    }
    /*	/// <summary>
        /// 根据Version表中的LastVersion创建Photo表
        /// </summary>
        /// <returns>结果</returns>
         public boolean setPhotoByLastVersion() {
            Document xml = this.open(xmlType.version); // 打开Version的连接
            //获取当前最终版本
            int lastVersion = Integer.parseInt(
               ((Element) xml.selectNodes("//lastVersion").get(0)).getText()
               );

            Map<String,Element> dc = new HashMap<String,Element>();// 用于记录被操作对象的以及xmlNode的引用
            //foreach (XmlElement item in xml.GetElementsByTagName("version"))
            //{
                for (int i = 0; i < lastVersion; i++)
                {
                    Element item = (Element)xml.selectNodes("//version").get(i);
                    // 遍历operationNode里的操作节点
                    for (Element operationNode : (List<Element>)item.selectNodes("./operation"))
                    {
                        String id = operationNode.valueOf("@OperateOid");
                        if (dc.containsKey(id)) {
                        // 如字典存在该key同时满足字典中的time小于新节点的time则覆盖
                        // 权限高且的覆盖字典中权限低的
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
                        dc.put(id, operationNode);// 存入字典
                    }

                }
            File file =new File(this.getRelPathByPathType(xmlType.photo));
            file.delete();//直接删除文件，再重新创建一个
            Document xmlPhoto = this.open(xmlType.photo); // 打开photo的连接
            ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(String.valueOf(lastVersion));
            Save(xmlPhoto,this.getLocalPath(xmlType.photo));
            List<PhotoFather> ls = new ArrayList<PhotoFather>();
            for (Map.Entry<String,Element> item : dc.entrySet())// 遍历字典 提取photo对象
            {
                ls.add(new PhotoFather(
                    item.getValue().valueOf("@OperateOid"),
                    operatorType.valueOf(item.getValue().valueOf("@Type")),
                    item.getValue().valueOf("@OldValue"),
                    item.getValue().valueOf("@NewValue")
                    ));
            }

            ls.size();
            this.setObject2xml(xmlType.photo, ls);// 将photo序列存入xml
            return true;

        }*/
    public boolean setPhotoByLastVersion() {
        return this.setPhoto();
    }

    /// <summary>
    /// 根据Version表中的LastVersion创建Photo表
    /// </summary>
    /// <param name="pType">操作photo的类型</param>
    /// <returns>结果</returns>
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
     /// 根据version的所处版本和快照的版本做差，追加新的快照
     /// </summary>
     /// <returns>结果</returns>
     public boolean appendPhotoByLastVersion()
     {
         Document xmlVersion = this.open(xmlType.version); // 打开Version的连接
         Document xmlPhoto = this.open( xmlType.photo); // 打开photo的连接
         //获取当前最终版本
         int lastVersion = Integer.parseInt(((Element)xmlVersion.selectNodes("//lastVersion").get(0)).getText());
         //获取photo中版本
         int photoVersion = Integer.parseInt(((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).getText());

         if (lastVersion == photoVersion)// 如果当前是最新版本直接返回
         {
             return true;
         }


         Map<String, Element> dc = new HashMap<String, Element>();// 用于记录被操作对象的以及xmlNode的引用

         for (int i = photoVersion; i < lastVersion; i++)
         {
        	 Element item = (Element)xmlVersion.selectNodes("//version").get(i);
             // 遍历operationNode里的操作节点
             for (Element operationNode : (List<Element>)item.selectNodes("//operation"))
             {
                 String id = operationNode.valueOf("@OperateOid");
                 if (dc.containsKey(id))
                 {
                     // 如字典存在该key同时满足字典中的time小于新节点的time则覆盖
                     // 权限高且的覆盖字典中权限低的
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
                 dc.put(id, operationNode);// 存入字典
             }

         }


         ((Element)xmlPhoto.selectNodes("//lastVersion").get(0)).setText(String.valueOf(lastVersion));
         List<PhotoFather> ls = new ArrayList<PhotoFather>();
         for (Map.Entry<String,Element> item : dc.entrySet())// 遍历字典 提取photo对象
         {

             ls.add(new PhotoFather(
            		 item.getValue().valueOf("@OperateOid"),
                     operatorType.valueOf(item.getValue().valueOf("@Type")),
                     item.getValue().valueOf("@OldValue"),
                     item.getValue().valueOf("@NewValue")
                     ));
         }

         List<Element> removeList = new ArrayList<Element>();
         // 这里获取了差异的photo序列需要验证photo表中不存在对同一实体的重复操作
         // 遍历确定removeList
         for (Element item : (List<Element>)xmlPhoto.selectNodes("//photo"))
         {
             if (dc.containsKey(item.valueOf("@OperateOid"))) {// 如果存在
                 removeList.add(item);
             }

         }
         for (Element item : removeList)
         {
             // 移除该节点
        	 //  xmlPhoto.GetElementsByTagName("data")[0].RemoveChild(item);
        	 //？这个节点为item的子节点 还是与item平行
             ((Element)xmlPhoto.selectNodes("//data").get(0)).remove(item);
             // 同时count要-1
             ((Element)xmlPhoto.selectNodes("//count").get(0)).setText(
            		 String.valueOf(Integer.parseInt((((Element)xmlPhoto.selectNodes("//count").get(0)).getText())) - 1));
         }


         Save(xmlPhoto,this.getRelPathByPathType(xmlType.photo));
         this.setObject2xml(xmlType.photo, ls);// 将photo序列存入xml
         return true;

     }*/
    /// <summary>
    /// 根据version的所处版本和快照的版本做差，追加新的快照
    /// </summary>
    /// <returns>结果</returns>
    public boolean appendPhotoByLastVersion()
    {
        return this.appendPhoto();
    }

    /// <summary>
    /// 根据version的所处版本和快照的版本做差，追加新的快照
    /// </summary>
    /// <param name="pType">操作photo的类型</param>
    /// <returns>结果</returns>
    public boolean appendPhotoByLastVersion(pathType pType)
    {
        pathType temp = this.PType;
        this.PType = pType;
        boolean result = this.appendPhoto();
        this.PType = temp;
        return result;
    }

    /// <summary>
    /// 版本回溯
    /// </summary>
    /// <param name="lastVersion">回到的版本为止</param>
    /// <returns>结果</returns>
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
            // 如果是版本前进
            if (Integer.parseInt(nodePhoto.getText()) <= Integer.parseInt(node.getText().trim())) {
                this.appendPhotoByLastVersion(); // 调用photo追加算法
            }else{
                // 调用重新生成photo的算法
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
    /// 创建缓冲区
    /// </summary>
    /// <returns>结果</returns>
    public boolean setRemoveVersion2Buffer() {
        Document xml = this.open(xmlType.version);
        Element dataNode = (Element) xml.selectNodes("//data").get(0);
        Element lastVersionNode = (Element) xml.selectNodes("//lastVersion").get(0);
        Element countNode = (Element) xml.selectNodes("//count").get(0);
        int lastVersion = Integer.parseInt(lastVersionNode.getText());
        int count = Integer.parseInt(countNode.getText());

        if (lastVersion == count) return true; // 如果条件有误则返回

        List<Element> list = xml.selectNodes("//version");
        List<Element> removeList = new ArrayList<Element>();
        for (int i = lastVersion; i < count; i++)
        {
            // 遍历需要移除的list并添加到list中
            removeList.add(list.get(i));
        }

        Document xmlBuffer =this.open(xmlType.buffer); // 打开buffer
        Element parent = (Element) xmlBuffer.selectNodes("//data").get(0);
        parent.element("count").setText(removeList.size()+"");
        Element deleteNode =  this.createElementNode( parent, "delete"); // 创建delete节点
         /*java.util.Date now = new java.util.Date();
 		 DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
 		 String time=format.format(now);*/
        String time = String.valueOf(System.currentTimeMillis());
        deleteNode.addAttribute("Time", time);
        //保留
        deleteNode.addAttribute("UserBy", this.UserBy);
        deleteNode.addAttribute("GUID", UUID.randomUUID() + "");
        for (Element item : removeList)
        {


            // 这里由于引入的node是其他xml的 必须用importNode
            //xmlBuffer.ImportNode(item, true);// 引入node ， true标识是否deep
            // 克隆节点
//        	 deleteNode.AppendChild(xmlBuffer.ImportNode(item, true)); // 添加到delete节点下

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

            dataNode.remove(item); // 删除Version中的记录
        }
        Save(xmlBuffer,this.getRelPathByPathType(xmlType.buffer));

        countNode.setText(String.valueOf(lastVersion));
        Save(xml,this.getRelPathByPathType(xmlType.version));


        // 在version中移除removeList中的node并添加到buffer中
        return true;
    }

    /// <summary>
    /// 克隆版本库（拉取到本地）
    /// </summary>
    /// <param name="sourceUrl">远程库路径</param>
    /// <param name="aimUrl">目标库路径</param>
    /// <returns>结果</returns>
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
            throw new Exception("目标库已存在，请重新选择路径");

        }
    }
    //文件管道复制方法
    //需要传输了两个字符串（源文件路径+名字，目标路径+名字）
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
            in = fi.getChannel();//得到对应的文件通道
            out = fo.getChannel();//得到对应的文件通道
            in.transferTo(0, in.size(), out);//连接两个通道，并且从in通道读取，然后写入out通道
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
    /// 推送版本库至源中央库（根据拉取时的setting）
    /// </summary>
    /// <returns></returns>
    public boolean pushBySetting() throws Exception {
        // 打开本地库setting
        Document settingXml = this.open(xmlType.setting);
        Element element = ((Element)settingXml.selectNodes("//origin").get(0));
        System.out.println(element.getName() +"   url:"+element.getText());
        String sourceUrl =  ((Element)settingXml.selectNodes("//origin").get(0)).getText();   // 远程库路径
        int slastVersion = Integer.parseInt(((Element)settingXml.selectNodes("//slastVersion").get(0)).getText());  // 远程库拉取时版本
        int snumber = Integer.parseInt(((Element)settingXml.selectNodes("//snumber").get(0)).getText());

        // 打开本地库version
        Document localVersionXml = this.open(xmlType.version);
        Node localDataNode = localVersionXml.selectSingleNode("data");
        int localNum = Integer.parseInt(localDataNode.selectSingleNode("number").getText());
        int localVersion = Integer.parseInt(localDataNode.selectSingleNode("lastVersion").getText());

        if (localNum < snumber)
        {
            throw new Exception("错误的提交，版本不匹配");
        }
        else if (localNum == snumber)
        {
            // 如何版本相同则无需提交
            return true;
        }

        // 如果版本发生更新
        // 计算更新的差值
        List<Element> list =  localDataNode.selectNodes("//version");
        List<Element> localUpdateList = new ArrayList<Element>(); // 本地更新的序列
        for (int i = snumber; i < list.size(); i++) // 正序的
        {
            localUpdateList.add(list.get(i));
        }

        // 打开远程库
        Document globalVersionXml = this.open(xmlType.version, sourceUrl+"version.xml");
        Element globalDataNode =  (Element) globalVersionXml.selectSingleNode("data");
        int globalNum = Integer.parseInt(globalDataNode.selectSingleNode("number").getText());
        int globalVersion = Integer.parseInt(globalDataNode.selectSingleNode("lastVersion").getText());

        List<Element> list2 = globalDataNode.selectNodes("//version");
        List<Element> globalUpdateList = new ArrayList<Element>(); // 中央库更新的序列
        for (int i = snumber; i < list2.size(); i++)
        {
            globalUpdateList.add(list2.get(i));
        }
        // 如果服务器在推送时没有其他版本更新
        if (globalUpdateList.size() == 0) {
            // 直接将新的版本累加到版本库中
            for (Element item : localUpdateList)
            {
                //globalDataNode.AppendChild(globalVersionXml.ImportNode(item,true)); // 将节点复制
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
            // 存储远程version库
            globalDataNode.selectSingleNode("number").setText(String.valueOf(globalNum + increment));
            globalDataNode.selectSingleNode("lastVersion").setText(String.valueOf(globalVersion + increment));
            globalDataNode.selectSingleNode("count").setText(String.valueOf((Integer.parseInt(globalDataNode.selectSingleNode("count").getText())+increment)));
            Save(globalVersionXml, sourceUrl + "version.xml");
            // 更新远程快照
            // 需在业务逻辑层完

            // 存储本地setting
            ((Element)settingXml.selectNodes("//slastVersion").get(0)).setText(String.valueOf(slastVersion + increment));
            ((Element)settingXml.selectNodes("//snumber").get(0)).setText(String.valueOf(snumber + increment));
            Save(settingXml,getRelPathByPathType(xmlType.setting));
        }
        else // ***如果服务器在推送时有其他版本更新（存在版本冲突的情况）
        {
            //foreach (XmlNode item in localUpdateList)
            //{
            //    globalVersionXml.ImportNode(item, true); // 将节点复制
            //}
            Map<String, List<Element>> localDc = new HashMap<String, List<Element>>();
            Map<String, List<Element>> globalDc = new HashMap<String, List<Element>>();
            for (Element item : localUpdateList)
            {
                for (Element operation : (List<Element>)item.selectNodes("//operation"))
                {
                    String oid = operation.valueOf("@OperateOid");
                    if (localDc.containsKey(oid))// 如包含
                    {
                        localDc.get(oid).add(operation);
                    }
                    else// 如不包含key则初始化
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
                    if (globalDc.containsKey(oid))// 如包含
                    {
                        globalDc.get(oid).add(operation);
                    }
                    else// 如不包含key则初始化
                    {
                        globalDc.put(oid, new ArrayList<Element>());
                        globalDc.get(oid).add(operation);
                    }
                }
            }
            // 存储冲突的操作id
            List<String> conflictList = new ArrayList<String>();
            for (Map.Entry<String,List<Element>> value : localDc.entrySet())
            {
                if (globalDc.containsKey(value.getKey())) {// 如存在冲突
                    // 存入冲突序列
                    conflictList.add(value.getKey());
                }
            }

            // ***存储删除的冲突节点
            List<Element> removeNodeList = new ArrayList<Element>();

            for (String item : conflictList)
            {
                // 如果local字典中存在item则移除
                if (localDc.containsKey(item)) {
                    // 这里遍历的是List<XmlNode>
                    for (Element node : localDc.get(item))
                    {
                        removeNodeList.add(node.createCopy());

                        //foreach (XmlNode version in localUpdateList)
                        //{
                        //    // 移除节点
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

                // 如果global字典中存在item则移除
                if (globalDc.containsKey(item)) {
                    // 这里遍历的是List<XmlNode>
                    for (Element node : globalDc.get(item))
                    {
                        removeNodeList.add(node.createCopy());
                        //foreach (XmlNode version in globalUpdateList)
                        //{
                        //    // 移除节点
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
            }// 移除节点结束

            // 此时该removeNodeList记录了所有的冲突，并且俩个updateList中的冲突节点已移除
            List<Element> conflictResList = new ArrayList<Element>(); // 用于冲突处理的序列
            // 解决完冲突获得的operation对象序列
            List<Element> updateOperationList = new ArrayList<Element>();
            String last="";
            for (Element item : removeNodeList)
            {
                String oid = item.valueOf("@OperateOid");
                if (last == "") last = oid;
                if (last == oid) {
                    conflictResList.add(item);
                }
                else // 如不等同表示同一id的冲突已填充完成
                {
                    // 冲突处理，存入合并后的操作序列
                    updateOperationList.add(conflicRes(conflictResList));
                    conflictResList = new ArrayList<Element>();
                    conflictResList.add(item);
                    last = oid;
                }
            }

            // updateOperationList为XmlNode集合，此时冲突处理完成
            // 将本地库版本推到远程版本库
            // 直接将新的版本累加到版本库中
            for (Element item : localUpdateList)
            {
                ((Element)item).addAttribute("num", (++globalNum) + "");
                //globalDataNode.AppendChild(globalVersionXml.ImportNode(item, true)); // 将节点复制
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
            // 存储远程version库
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

            // 移除原先的版本节点，同步至中央库的版本
            // 移除原先的data节点
            localVersionXml.remove(localDataNode);
            // 移植中央库的data节点
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
    /// 冲突处理
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
                // 表示存在权限冲突（至少一对操作有冲突）
                // 如果自动合并无效则手动合并
                return conflictResByAdmin(list);
            }
            else {
                priority.add(p);
            }
        }
        return conflicResAuto(list);
    }
    /// <summary>
    /// 冲突自动处理
    /// </summary>
    /// <param name="list"></param>
    /// <returns></returns>
    public Element conflicResAuto(List<Element> list) {
        return list.get(0);
    }
    /// <summary>
    /// 冲突通过admin处理
    /// </summary>
    /// <param name="list"></param>
    /// <returns></returns>
    public Element conflictResByAdmin(List<Element> list) {
        System.out.println("存在冲突数目共："+list.size());
        int count = 1;
        int flag;
        for (Element item : list)
        {
            System.out.println(count+ "、冲突"+count++ + "是：" + item.valueOf("@Oid")+":"+item.valueOf("@Type")+","+item.valueOf("@OldValue")+","+item.valueOf("@NewValue"));
        }
        while (true) {
            System.out.println("请输入采纳的操作：");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextInt();
            if(flag<=list.size()) break;
        }
        ((Element)(list.get(flag - 1))).addAttribute("Priority", "5");
        return list.get(flag-1);
    }


    /// <summary>
    /// 根据setting中的origin拉取最新版本
    /// </summary>
    public boolean pullFromOrigin() {
        try{
            // 打开本地库setting
            Document settingXml = this.open(xmlType.setting);
            String sourceUrl = ((Element)settingXml.selectNodes("//origin").get(0)).getText();   // 远程库路径
            String snumber = ((Element)settingXml.selectNodes("//snumber").get(0)).getText();
            // 打开远程库
            Document globalVersionXml = this.open(xmlType.version, sourceUrl + "version.xml");
            Element globalDataNode = (Element) globalVersionXml.selectSingleNode("data");
            String globalNum =globalDataNode.selectSingleNode("number").getText();
            String globalVersion = globalDataNode.selectSingleNode("lastVersion").getText();
            // 如果不需要pull则
            if (snumber == globalNum) return true;
            // 打开本地库version
            Document localVersionXml = this.open(xmlType.version);
            Element localDataNode = (Element) localVersionXml.selectSingleNode("data");

            // 更新本地版本库
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
            // 更新setting
            ((Element)settingXml.selectNodes("//slastVersion").get(0)).setText(globalVersion);
            ((Element)settingXml.selectNodes("//snumber").get(0)).setText(globalNum);
            Save(settingXml,this.getRelPathByPathType(xmlType.setting));
            // 重置快照
            this.appendPhotoByLastVersion();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    /// <summary>
    /// 根据配置的路径获取Photo列表
    /// </summary>
    /// <returns>photo对象的序列</returns>
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
    /// 获取Version表中全部的versionlist
    /// </summary>
    /// <returns>versionlist的列表</returns>
    public List<OVersion> getVersionList() throws Exception
    {
        List<OVersion> list = new ArrayList<OVersion>();
        Document xml = this.open(xmlType.version);
        Element dataNode = (Element)xml.selectSingleNode("data");
        for (Element item : (List<Element>)dataNode.selectNodes("version"))
        {
            List<OperationFather> subList = new ArrayList<OperationFather>();
            // 遍历获取version中的operation
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
            // 这里遍历获取的是version
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
            // 遍历获取version中的operation
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
            // 这里遍历获取的是version
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
    /// 获取Operation表中的operationlist
    /// </summary>
    /// <returns>当前操作序列（未提交）</returns>
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
    /// 获取当前版本位置
    /// </summary>
    /// <param name="xType">文档类型</param>
    /// <returns>版本位置</returns>
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
    /// 序列化对象成字符串
    /// </summary>
    /// <param name="obj">需要序列化的对象</param>
    /// <returns>序列化后的字符串</returns>
    public String serialize(Object obj) throws Exception
    {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        String serStr = byteArrayOutputStream.toString("ISO-8859-1");//必须是ISO-8859-1
        serStr = java.net.URLEncoder.encode(serStr, "UTF-8");//编码后字符串不是乱码（不编也不影响功能）
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return serStr;
    }

    /// <summary>
    /// 反序列化对象
    /// </summary>
    /// <param name="objStr">被序列化的对象（string类型）</param>
    /// <returns>对象</returns>
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

