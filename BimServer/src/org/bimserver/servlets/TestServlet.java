package org.bimserver.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bimserver.BimServer;
import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.PostCommitAction;
import org.bimserver.database.Query;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.literals.StringLiteral;
import org.bimserver.interfaces.SConverter;
import org.bimserver.interfaces.objects.SDataObject;
import org.bimserver.interfaces.objects.SDataValue;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SProjectSmall;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.log.ProjectUpdated;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.SIPrefix;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.plugins.services.BimServerClientInterface;
import org.bimserver.shared.AuthenticationInfo;
import org.bimserver.shared.BimServerClientFactory;
import org.bimserver.shared.UsernamePasswordAuthenticationInfo;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.utils.CollectionUtils;
import org.bimserver.webservices.authorization.Authorization;
import org.eclipse.emf.common.util.EList;


public class TestServlet extends HttpServlet {
	
	/**
	 * 该servlet作为测试servlet
	 * 实现功能获得BinServer这个对象
	 * 获得bimserver中的数据库地址、启动时间信息
	 * 使用方法直接请求localhost:8080/Test
	 * 配置方式在BimServer项目下/www/WEB-INF/web.xml文件中
	 * @author Lab
	 */	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		try{
//		String token = (String) request.getSession().getAttribute("token");
//		Authorization authorization = Authorization.fromToken(bimServer.getEncryptionKey(), token);
//		User user = session.get(authorization.getUoid(), Query.getDefault());//@ch 获得发起session的user	
			
		//获取bimserver对象、database对象、session对象、client对象
		BimServer bimServer = (BimServer)getServletContext().getAttribute("bimserver");
		BimDatabase database = bimServer.getDatabase();
		DatabaseSession session = database.createSession();
		BimServerClientFactory bimServerClientFactory = bimServer.getBimServerClientFactory();
		BimServerClientInterface bimServerClientInterface =  bimServerClientFactory.create();

//		DirectBimServerClientFactory<PublicInterface> client = (DirectBimServerClientFactory<PublicInterface>) bimServerClientFactory;
//		BimServerClient bimServerClient = client.create(new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"));

		//创建查询管理员条件
		String username = "admin@bimserver.org";
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getUser_Username(), new StringLiteral(username.trim().toLowerCase()));
		User user = session.querySingle(condition, User.class, Query.getDefault());
		
		
//		user.getOid(); //131074
//		user.getPid(); //1
/*		AuthenticationInfo authentication = new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin");
		bimServerClientInterface.setAuthentication(authentication);
		long oid = 131073;
		SProjectSmall projectSmall = bimServerClientInterface.getBimsie1ServiceInterface().getProjectSmallByPoid(oid);*/
		
		EList<Project> eList = user.getHasRightsOn();
		for(Project project : eList)
		{	
//			bimServerClientInterface.getBimsie1AuthInterface().getAccessMethod();
			
			//SProjectSmall small = createSmallProject(authorization, bimServer, project, user);
	/*		if (!project.getName().equalsIgnoreCase("demo1")) {
				continue;
			}*/
			EList<Revision> eRevisions = project.getRevisions();
			for(Revision revision : eRevisions)
			{	
//				if (! (revision.getId() == 2)) {
//					continue;
//				}
				System.out.println(project.getOid()+" ProjectName:"+project.getName()+" RevisionId:"+revision.getId());
		/*		revision.getOid();
				revision.getId();
				revision.getSize();
				revision.eCrossReferences();
				EClass eClass = session.getEClassForOid(590573);
				EList<EStructuralFeature> eStructuralFeatures = eClass.getEAllStructuralFeatures();
				for(EStructuralFeature e : eStructuralFeatures){
					e.getFeatureID();
					e.getName();
					System.out.println(e);
					
				}*/
				AuthenticationInfo authentication = new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin");
				bimServerClientInterface.setAuthentication(authentication);
//				bimServerClientInterface.getBimsie1ServiceInterface().getProjectSmallByPoid((long)131073);
				List<SDataObject> list = bimServerClientInterface.getBimsie1LowLevelInterface().getDataObjects(revision.getOid());
					for(SDataObject listItem : list){
						/*List<SDataValue> values = listItem.getValues();
						for(SDataValue value : values){
							if (!(value == null) || !value.toString().trim().isEmpty()) {
								System.out.println("value:"+ value.getFieldName());
							}
						}*/
					System.out.println("Name:"+listItem.getName()+""+" \t Oid:"+listItem.getOid()+" \t Type:"+listItem.getType()+"\t GUID:"+listItem.getGuid());
				}
			}
		}
//		SDownloadResult checkoutResult = bimServerClientInterface.getBimsie1ServiceInterface().getDownloadData((long)3);//得到项目数据  @byljn
		/**			
		AuthenticationInfo authentication = new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin");
		bimServerClientInterface.setAuthentication(authentication);
		
		//读取硬盘数据库
		File dataDir = new File("D:\\9-9\\BIMServer\\BimServer\\home1\\database");
		BerkeleyKeyValueStore valueStore = new BerkeleyKeyValueStore(dataDir);
		System.out.println(valueStore.getAllTableNames());
	//	valueStore.containsTable("store_Project");
	//	System.out.println(valueStore.containsTable("store_Project"));//为true
	*/			
		//通过项目名字获取到 project
		//Set<Project>  set = getProjectsByName("23", session);
	/**			
		//依据oid 获取project对象 直接从数据库中
		long oid = 327681;
		Project project0  = session.get(StorePackage.eINSTANCE.getProject(), oid, Query.getDefault());
//		session.getEClassForOid(oid);
		//依据oid 获取sProject对象 接口
//		SProject sProject = bimServerClientInterface.getBimsie1ServiceInterface().getProjectByPoid(oid);	
		project0.setName("test06");
//		project0.setCreatedDate(new Date());
		EClass eClass = session.getEClassForOid(oid);	
		user.getRevisions();
	*/
		//session 存储 project
		session.setOverwriteEnabled(false);		
//		session.store(null);
		session.commit();
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void doGet00(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		try{
//		String token = (String) request.getSession().getAttribute("token");
//		Authorization authorization = Authorization.fromToken(bimServer.getEncryptionKey(), token);
//		User user = session.get(authorization.getUoid(), Query.getDefault());//@ch 获得发起session的user	
			
		//获取bimserver对象、database对象、session对象、client对象
		BimServer bimServer = (BimServer)getServletContext().getAttribute("bimserver");
		BimDatabase database = bimServer.getDatabase();
		DatabaseSession session = database.createSession();
		BimServerClientInterface bimServerClientInterface =  bimServer.getBimServerClientFactory().create();
		
		//创建查询管理员条件
		String username = "admin@bimserver.org";
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getUser_Username(), new StringLiteral(username.trim().toLowerCase()));
		
		//获取管理员权限
		User user = session.querySingle(condition, User.class, Query.getDefault());
		AuthenticationInfo authentication = new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin");
		bimServerClientInterface.setAuthentication(authentication);
	
		long oid = 327681;
		SProject sProject = bimServerClientInterface.getBimsie1ServiceInterface().getProjectByPoid(oid);	
		sProject.setOid(666666);
		sProject.setName("new Test");
		
		User actingUser = user;
		final Project project = getProjectByPoid(sProject.getOid(), session);
		if (project == null) {
			throw new UserException("Project with pid " + sProject.getOid() + " not found");
		}
		if (sProject.getName().trim().equals("")) {
			throw new UserException("Project name cannot be empty");
		}
		if (project.getParent() == null) {
			if (!sProject.getName().equals(project.getName())) {
				for (Project p : getProjectsByName(sProject.getName(), session)) {
					if (p.getParent() == null) {
						throw new UserException("Project name must be unique");
					}
				}
			}
		} else {
			Project parent = project.getParent();
			for (Project subProject : parent.getSubProjects()) {
				if (subProject.getName().equals(sProject.getName()) && subProject != project) {
					throw new UserException("Project name must be unique within parent project (" + parent.getName() + ")");
				}
			}
		}
		project.setName(sProject.getName());
		project.setDescription(sProject.getDescription());
		project.setExportLengthMeasurePrefix(SIPrefix.get(sProject.getExportLengthMeasurePrefix().getOrdinal()));
		final ProjectUpdated projectUpdated = session.create(ProjectUpdated.class);
		projectUpdated.setAccessMethod(AccessMethod.INTERNAL);
		projectUpdated.setDate(new Date());
		projectUpdated.setExecutor(actingUser);
		projectUpdated.setProject(project);
		session.addPostCommitAction(new PostCommitAction() {
			@Override
			public void execute() throws UserException {
				bimServer.getNotificationsManager().notify(new SConverter().convertToSObject(projectUpdated));
			}
		});
		session.setOverwriteEnabled(false);		
		session.store(project);
		
		session.commit();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SProjectSmall createSmallProject(Authorization authorization, BimServer bimServer, Project project, User user) {
		SProjectSmall small = new SProjectSmall();//@ch create small project and set content
		small.setName(project.getName());
		small.setOid(project.getOid());
		small.setLastRevisionId(project.getLastRevision() == null ? -1 : project.getLastRevision().getOid());
		small.setNrRevisions(project.getRevisions().size());
		small.setSchema(project.getSchema());
		small.setNrSubProjects(project.getSubProjects().size());
		small.setHasCheckinRights(authorization.hasRightsOnProject(user, project));
		small.setState(bimServer.getSConverter().convertToSObject(project.getState()));
		small.setParentId(project.getParent() == null ? -1 : project.getParent().getOid());
		return small;
	}
	public Set<Project> getProjectsByName(String projectName, DatabaseSession session) throws BimserverDatabaseException, BimserverLockConflictException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getProject_Name(), new StringLiteral(projectName));
		return CollectionUtils.mapToSet(session.query(condition, Project.class, Query.getDefault()));
	}
	public Project getProjectByPoid(long poid, DatabaseSession session) throws BimserverDatabaseException {
		return session.get(StorePackage.eINSTANCE.getProject(), poid, Query.getDefault());
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BimServer bimServer = (BimServer)getServletContext().getAttribute("bimserver");
		response.getWriter().print(bimServer.getHomeDir().toString());	
	}
		
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doGet()...");
//		doit(request, response);
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost()...");
//		doit(request, response);
//	}
//	private void doit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		SProject sProject = (SProject) request.getAttribute("project");
//		String string = sProject.getDescription().toString();
//		response.getWriter().println(string);
		
//		ServiceMap serviceMap = new ServiceMap(bimServer, authorization, accessMethod);
//		Bimsie1ServiceImpl bimsie1ServiceImpl = new Bimsie1ServiceImpl(serviceMap);
//		List<SProject> project = bimsie1ServiceImpl.getProjectsByName("");
//		response.getWriter().print(project.toString());
		
/*		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print((BimServer)getServletContext().getAttribute("bimserver"));*/
		
/*		String name = request.getParameter("name");
		String pwd  = request.getParameter("pwd");
		//向浏览器输出		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("<h1>用户名："+name+"</h1>");
		response.getWriter().print("<h1>密 码："+pwd+"</h1>");
	}*/

}
