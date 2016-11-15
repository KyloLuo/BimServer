"use strict"

/**
 * Class: BIMSURFER.Control.ClickSelect
 * Control to select and hightlight a Scene JS by clicking on it.
 */
var IntervalId = -1;

var getRandom = function(max, min,flag){
	if(flag)
		return Math.floor(Math.random()*(max-min))+min+Math.floor(Math.random()*10)*0.1;
	else
		return Math.floor(Math.random()*(max-min))+min;
};

BIMSURFER.Control.ClickSelect = BIMSURFER.Class(BIMSURFER.Control, {
	CLASS: "BIMSURFER.Control.ClickSelect",

	/**
	 * X coordinate of the last mouse event
	 */
	downX: null,

	/**
	 * Y coordinate of the last mouse event
	 */
	downY: null,
	
	active: false,

	/**
	 * The selected and highlighted SceneJS node
	 */
	highlighted: null,

	/**
	 * Timestamp of the last selection
	 */
	lastSelected: -1,

	/**
	 * Constructor.
	 *
	 * @constructor
	 */
	__construct: function() {
		this.events = new BIMSURFER.Events(this);
	},
	
	
	
	/**
	 * Activates the contol
	 */
	activate: function() {
		if(this.SYSTEM == null || !this.SYSTEM.sceneLoaded) {
			console.error('Cannot activate ' + this.CLASS + ': Surfer or scene not ready');
			return null;
		}
		if (!this.active) {
			this.active = true;
			this.initEvents();
			this.events.trigger('activated');
		}
		return this;
	},

	/**
	 * Initializes the events necessary for the operation of this control
	 *
	 * @return this
	 */
	initEvents: function() {
		if(this.active) {
			this.SYSTEM.events.register('pick', this.pick, this);
			this.SYSTEM.events.register('mouseDown', this.mouseDown, this);
			this.SYSTEM.events.register('mouseUp', this.mouseUp, this);
		} else {
			this.SYSTEM.events.unregister('pick', this.pick, this);
			this.SYSTEM.events.unregister('mouseDown', this.mouseDown, this);
			this.SYSTEM.events.unregister('mouseUp', this.mouseUp, this);
		}
		return this;
	},

	/**
	 * Event listener
	 *
	 * @param {mouseEvent} e Mouse event
	 */
	mouseDown: function(e) {
		this.downX = e.offsetX;
		this.downY = e.offsetY;
		var a = $(".main .maincontainer");
		var b = "";
	},

	/**
	 * Event listener
	 *
	 * @param {mouseEvent} e Mouse event
	 */
	mouseUp: function(e) {
		if(((e.offsetX > this.downX) ? (e.offsetX - this.downX < 5) : (this.downX - e.offsetX < 5)) &&	((e.offsetY > this.downY) ? (e.offsetY - this.downY < 5) : (this.downY - e.offsetY < 5))) {
			if(Date.now() - this.lastSelected > 10) {
				this.unselect();
			}
		}
	},

	/**
	 * Event listener
	 *
	 * @param {SceneJS.node} hit Selected SceneJS node
	 */
	pick: function(hit) {
		this.unselect();
		if(hit.nodeId=="205979814"||hit.id=="205979814")
			{
			if(IntervalId){
				clearInterval(IntervalId);
				
				IntervalId = setInterval(function(){
					$("#x1").empty();
					$("#x1").append("<span style='font-weight:bolder'>逆变器-3172800</span><br />直流侧最大输入功率：30kW<br />直流侧最大输入电压：500V<br />最大输出功率：30kW<br />额定输出功率因数：0.99<br />额定输出谐波含量：0.1%<br />温度：<span style='color:red'>"+getRandom(42,40,true)+"℃</span><br />输入功率：<span style='color:red'>"+getRandom(30,27)+"kW</span><br />输入电压：<span style='color:red'>"+getRandom(500,450)+"V</span><br />" +
							"输出功率：<span style='color:red'>"+ getRandom(27,25,true)+"kW</span><br />输出功率因数：<span style='color:red'>0.95</span><br />输出谐波总含量：<span style='color:red'>0.1%</span>");
				},2000);
				$("#showInformation").fadeIn(2000);
				$("#showInformation").animate({height:"275px"});
			}
			}
		else if(hit.nodeId=="131821"||hit.id=="131821")
			{
			if(IntervalId){
				clearInterval(IntervalId);
				$("#showInformation").fadeIn(1000);
				$("#x1").text("456456");
				}
			}
		else if(IntervalId){ $("#showInformation").fadeOut(500);}
		
		
		
		
		this.highlighted = this.SYSTEM.scene.findNode(hit.nodeId);
		var groupId = this.highlighted.findParentByType("translate").data.groupId;

		var matrix = this.highlighted.nodes[0];
		var geometryNode = matrix.nodes[0];

		if (geometryNode._core.arrays.colors != null) {
			var geometry = {
				type: "geometry",
				primitive: "triangles"
			};
	
			geometry.coreId = geometryNode.getCoreId() + "Highlighted";
			geometry.indices = geometryNode._core.arrays.indices;
			geometry.positions = geometryNode._core.arrays.positions;
			geometry.normals = geometryNode._core.arrays.normals;
			
			geometry.colors = [];
			for (var i=0; i<geometryNode._core.arrays.colors.length; i+=4) {
				geometry.colors[i] = 0;
				geometry.colors[i+1] = 1;
				geometry.colors[i+2] = 0;
				geometry.colors[i+3] = 1;
			}
			
			var library = this.SYSTEM.scene.findNode("library-" + groupId);
			library.add("node", geometry);
			
			var newGeometry = {
				type: "geometry",
				coreId: geometryNode.getCoreId() + "Highlighted"
			}
			
			matrix.removeNode(geometryNode);
			matrix.addNode(newGeometry);
		}
		
		this.highlighted.insert('node', BIMSURFER.Constants.highlightSelectedObject);
		this.lastSelected = Date.now();
		var o = this;
		window.setTimeout(function(){
			o.events.trigger('select', [groupId, o.highlighted]);
		}, 0);
	},

	/**
	 * Event listener
	 */
	unselect: function() {
		var highlighted = this.SYSTEM.scene.findNode(BIMSURFER.Constants.highlightSelectedObject.id);
		if (highlighted != null) {
			var groupId = highlighted.findParentByType("translate").data.groupId;
			if(highlighted != null)
			{
				var matrix = highlighted.nodes[0];
				var geometryNode = matrix.nodes[0];
				
				if (geometryNode._core.arrays.colors != null) {
					matrix.removeNode(geometryNode);
					
					var newGeometry = {
						type: "geometry",
						coreId: geometryNode.getCoreId().replace("Highlighted", "")
					}
					
					matrix.addNode(newGeometry);
				}
				
				highlighted.splice();
				
				this.events.trigger('unselect', [this.highlighted == null ? null : this.highlighted.findParentByType("translate").groupId, this.highlighted]);
				this.highlighted = null;
			}
		}
	}
});