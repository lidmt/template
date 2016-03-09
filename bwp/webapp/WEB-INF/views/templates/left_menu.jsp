<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- User menu -->
<div class="sidebar-user">
  <div class="category-content">
    <div class="media">
      <a href="#" class="media-left"><img src="/images/placeholder.jpg" class="img-circle img-sm" alt=""></a>
      <div class="media-body">
        <span class="media-heading text-semibold">Victoria Baker</span>
        <div class="text-size-mini text-muted">
          <i class="icon-pin text-size-small"></i> &nbsp;Santa Ana, CA
        </div>
      </div>

      <div class="media-right media-middle">
        <ul class="icons-list">
          <li>
            <a href="#"><i class="icon-cog3"></i></a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</div>
<!-- /user menu -->


<!-- Main navigation -->
<div class="sidebar-category sidebar-category-visible">
  <div class="category-content no-padding">
    <ul class="navigation navigation-main navigation-accordion">

      <!-- Main -->
      <li class="navigation-header"><span>Main</span> <i class="icon-menu" title="Main pages"></i></li>
      <li><a href="index.html"><i class="icon-home4"></i> <span>Dashboard</span></a></li>
      <!-- menu level 1 -->
      <c:forEach var="level_1" items="${menu_list}">
        <li><a href="${level_1.url}"><i class="icon-grid"></i> <span>${level_1.name}</span></a>
          
          <!-- menu level 2 -->
          <c:if test="${level_1.sub_menu != null or level_1.sub_menu.size != 0}">
            <ul>
            <c:forEach var="level_2" items="${level_1.sub_menu}">
              <li><a href="${level_2.url}"><i class="icon-grid"></i> <span>${level_2.name}</span></a>
                
                <!-- menu level 3 -->
                <c:if test="${level_2.sub_menu != null or level_2.sub_menu.size != 0}">
                  <ul>
                    <c:forEach var="level_3" items="${level_2.sub_menu}">
                      <li><a href="${level_3.url}"><i class="icon-grid"></i> <span>${level_3.name}</span></a>
                    </c:forEach>
                  </ul>
                </c:if>
                <!-- /menu level 3 -->
              
              </li>
            </c:forEach>
            </ul>
          </c:if>
          <!-- /menu level 2 -->
          
        </li>
      </c:forEach>
       <!-- /menu level 1 -->
    </ul>
  </div>
</div>

<!-- /main navigation -->
