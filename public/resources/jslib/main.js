// JavaScript Document
var center_tabs;
var west_tree;
$(function(){
	center_tabs=$('#center_tabs').tabs({
		border:false,
		fit:true,
		onSelect:function(title){
        	//alert(title+' is selected');
		}
		});
	
	west_tree = $('#west_tree').tree({
	    data: [
		   {
			id:1,
			text:"部门管理",
			attributes:"deparment",
		   },
		   {
			id:2,
			text:"人员管理",
			attributes:"person",
		   },
		   {
			id:3,
			text:"试题管理",
			children:
				[{
				 id: 4,
				 text:"判断题管理",
				 attributes:"",
				},
				{
				 id: 5,
				  text:"单选题管理",
				  attributes:"singletopic",
				},
				{
				 id: 6,
				 text:"多选题管理",
				 attributes:"",
				},]
		   },
		  {
			id:7,
			text:"成绩查询",
			attributes:"score",
		   },
		   ],
		onClick: function(node){
		    if (node.attributes == '' || node.attributes == undefined) retuen; 
		    if (center_tabs.tabs('exists',node.text)){
				center_tabs.tabs('select', node.text);
			} 
		    else {
			 center_tabs.tabs('add',{
				title:node.text,
				closable:true,
				href: node.attributes,
				tools:[{
					iconCls:'icon-mini-refresh',
					handler:function(){
						//alert('refresh');
						}
				}]});
		    }		
		   }		
	});
				
	});


var exitSystem = function () {
    $.messager.confirm('确认是否退出系统', '您真的要退出系统吗?', function (r) {
        if (r) {
            $.get('/exam/logout.html', function () {
                window.location.replace('/login.html');
            });
        }
    });
}


var changeEasyuiTheme = function (themeName) {
    var themeId = $('#easyui_theme');
    themeId.attr('href', 'resources/easyui/themes/' + themeName + '/easyui.css');
    $.cookie('easyuiThemeName', themeName, {
        expires: 7,
        path: '/'
    });
}
