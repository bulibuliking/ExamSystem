// JavaScript Document
var login_form;
$(function(){
	login_form = $('#login_form').form({
		url:'/login.json',
		success:function(data){
			var data = $.parseJSON(data);
			showMsgBox(data.msg,'提示信息');
			if(data.success){
				window.setTimeout(function(){
                            window.location.href='/exam/main.html';
                        },1300);
				}
			}
		});
	});
	
	
var userLogin = function(){
	login_form.form('submit');
	}