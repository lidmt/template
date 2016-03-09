<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<!-- Global stylesheets -->
<link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
<link href="/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
<link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/css/core.min.css" rel="stylesheet" type="text/css">
<link href="/css/components.min.css" rel="stylesheet" type="text/css">
<link href="/css/colors.min.css" rel="stylesheet" type="text/css">
<!-- /global stylesheets -->

<!-- Core JS files -->
<script type="text/javascript" src="/js/plugins/loaders/pace.min.js"></script>
<script type="text/javascript" src="/js/core/libraries/jquery.min.js"></script>
<script type="text/javascript" src="/js/core/libraries/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/plugins/loaders/blockui.min.js"></script>
<!-- /core JS files -->

<!-- Theme JS files -->
<script type="text/javascript" src="/js/plugins/visualization/d3/d3.min.js"></script>
<script type="text/javascript" src="/js/plugins/visualization/d3/d3_tooltip.js"></script>
<script type="text/javascript" src="/js/plugins/forms/styling/switchery.min.js"></script>
<script type="text/javascript" src="/js/plugins/forms/styling/uniform.min.js"></script>
<script type="text/javascript" src="/js/plugins/forms/selects/bootstrap_multiselect.js"></script>
<script type="text/javascript" src="/js/plugins/ui/moment/moment.min.js"></script>
<script type="text/javascript" src="/js/plugins/pickers/daterangepicker.js"></script>
<script type="text/javascript" src="/js/plugins/ui/nicescroll.min.js"></script>

<script type="text/javascript" src="/js/core/app.js"></script>
<script type="text/javascript" src="/js/pages/dashboard.js"></script>
<script type="text/javascript" src="/js/pages/layout_fixed_custom.js"></script>
<!-- /theme JS files -->

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