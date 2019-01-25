package com.compuware.ispw.restapi.action;

/**
 * All supported ISPW actions, you must define your actions in this class 
 * to be exposed as Jenkins command
 * 
 * @author Sam Zhou
 *
 */
public class IspwCommand {
	
	@IspwAction(clazz = CreateAssignmentAction.class)
	public static final String CreateAssignment = "CreateAssignment"; // POST
	
	@IspwAction(clazz = GetAssignmentInfoAction.class)
	public static final String GetAssignmentInfo = "GetAssignmentInfo"; // GET
	
	@IspwAction(clazz = GetAssignmentTaskListAction.class)
	public static final String GetAssignmentTaskList = "GetAssignmentTaskList"; // GET
	
	@IspwAction(clazz = GenerateTasksInAssignmentAction.class)
	public static final String GenerateTasksInAssignment = "GenerateTasksInAssignment"; // POST
	
	@IspwAction(clazz = PromoteAssignmentAction.class)
	public static final String PromoteAssignment = "PromoteAssignment"; // POST
	
	@IspwAction(clazz = DeployAssignmentAction.class)
	public static final String DeployAssignment = "DeployAssignment"; // POST
	
	@IspwAction(clazz = RegressAssignmentAction.class)
	public static final String RegressAssignment = "RegressAssignment"; // POST
	
	@IspwAction(clazz = GetReleaseInfoAction.class)
	public static final String GetReleaseInfo = "GetReleaseInfo"; // GET
	
	@IspwAction(clazz = GetReleaseTaskListAction.class)
	public static final String GetReleaseTaskList = "GetReleaseTaskList"; // GET
	
	@IspwAction(clazz = CreateReleaseAction.class)
	public static final String CreateRelease = "CreateRelease"; // POST
	
	@IspwAction(clazz = GenerateTasksInReleaseAction.class)
	public static final String GenerateTasksInRelease = "GenerateTasksInRelease"; // POST
	
	@IspwAction(clazz = GetReleaseTaskGenerateListingAction.class)
	public static final String GetReleaseTaskGenerateListing = "GetReleaseTaskGenerateListing"; // GET
	
	@IspwAction(clazz = GetReleaseTaskInfoAction.class)
	public static final String GetReleaseTaskInfo = "GetReleaseTaskInfo"; // GET
	
	@IspwAction(clazz = PromoteReleaseAction.class)
	public static final String PromoteRelease = "PromoteRelease"; // POST
	
	@IspwAction(clazz = DeployReleaseAction.class)
	public static final String DeployRelease = "DeployRelease"; // POST
	
	@IspwAction(clazz = RegressReleaseAction.class)
	public static final String RegressRelease = "RegressRelease"; // POST
	
	@IspwAction(clazz = GetSetInfoAction.class)
	public static final String GetSetInfo = "GetSetInfo"; //GET
	
	@IspwAction(clazz = GetSetTaskListAction.class)
	public static final String GetSetTaskList = "GetSetTaskList"; //GET
	
	@IspwAction(clazz = TransferTaskAction.class)
	public static final String TransferTask = "TransferTask"; //POST
	
	@IspwAction(clazz = GetContainerListAction.class)
	public static final String GetContainerList = "GetContainerList"; //GET

	@IspwAction(clazz = CancelDeployment.class)
	public static final String CancelDeployment = "CancelDeployment"; //POST

	@IspwAction(clazz = AddTaskAction.class)
	public static final String AddTask = "AddTask"; //POST
}
