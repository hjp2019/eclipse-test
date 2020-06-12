<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<script type="text/javascript" src="../Js/prototype.js"></script>  
<SCRIPT type="text/javascript">
function clickButton(){
var url = "a.jsp";
var obj=document.getElementById("name");
  new Ajax.Updater(obj,url, 
     {   method: 'get',   
      onSuccess: function(transport) 
      {
       alert(transport.responseText);
      } 
     });

	}
	
	
	
</SCRIPT>
 <input id="name" type="text">
 <input type="button" value="ok" onclick="javascript:clickButton();">
