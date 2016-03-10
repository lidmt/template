<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<tiles:insertAttribute name="core_resources"/>

<tiles:insertAttribute name="theme_js"/>

</head>
<body class="navbar-top">

  <!-- top navigation -->
  <div class="navbar navbar-inverse navbar-fixed-top">
    <tiles:insertAttribute name="top_header"/>
  </div>
  <!-- top navigation -->

  <!-- page container -->
  <div class="page-container">
    <div class="page-content">
      <div class="sidebar sidebar-main sidebar-fixed">
        <div class="sidebar-content">
          <tiles:insertAttribute name="left_menu"/>
        </div>
      </div>
      <!-- Main content -->
      <div class="content-wrapper">
        <!-- Page heder -->
        <div class="page-header">
          <tiles:insertAttribute name="page_header"/>
        </div>          
        <!-- Page heder -->
        
        <!-- Content area -->
        <div class="content">
          <tiles:insertAttribute name="page_content"/>
        </div>
        <!-- Content area -->
      </div>
      <!-- Main content -->
    </div>
  </div>
  <!-- page container -->
  
</body>
</html>