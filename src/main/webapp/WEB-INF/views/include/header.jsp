<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<header class="header-area">

<div><h3>aasdfasdf???</h3></div>
<div class="header-nav">
	<div class="container custom-container">
		<div class="row">
			<div class="col-lg-12">
				<div class="navigation">
					<nav class="navbar navbar-expand-lg navbar-light "><a class="navbar-brand" href="${contextPath}/">
					 <img src="${assetsPath}/images/logo-e.png" alt=""> <!-- logo  -->
					</a>
					<!-- logo -->
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="toggler-icon"></span><span class="toggler-icon"></span><span class="toggler-icon"></span></button>
					<!-- navbar toggler -->
					<div class="collapse navbar-collapse sub-menu-bar" id="navbarSupportedContent">
						<ul class="navbar-nav m-auto">
							<li class="nav-item active"><a class="nav-link" href="${contextPath}/">홈</a>
							<ul class="sub-menu">
								<li><a href="index.html">Home 1</a></li>
								<li><a href="index-2.html">Home 2</a></li>
							</ul>
							</li>
							<li class="nav-item"><a class="nav-link" href="about.html">About</a></li>
							<li class="nav-item"><a class="nav-link" href="manu.html">Menu</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Pages</a>
							<ul class="sub-menu">
								<li><a href="faq.html">FAQ</a></li>
								<li><a href="team.html">Team</a></li>
								<li><a href="gallery.html">Gallery</a></li>
								<li><a href="restaurant.html">restaurant</a></li>
								<li><a href="restaurant-details.html">restaurant Details</a></li>
								<li><a href="blog-standard.html">blog standard</a></li>
								<li><a href="blog-details.html">blog Details</a></li>
							</ul>
							</li>
							<li class="nav-item"><a class="nav-link" href="contact.html">Conact</a></li>
						</ul>
					</div>
					<!-- navbar collapse -->
					<div class="navbar-btn d-none d-md-flex">
						<ul>
							<li><a href="${contextPath}/mypageU/cart"><i class="fas fa-shopping-basket"></i></a></li>
							<li><a href="${contextPath}/mypageU/mypage"><i class="fas fa-user"></i></a></li>
						</ul>
						<a class="main-btn" href="#">Sign in</a>
					</div>
					</nav>
				</div>
				<!-- navigation -->
			</div>
		</div>
	</div>
</div>
</header>