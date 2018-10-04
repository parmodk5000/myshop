

<%@page import="model.AddProduct"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.AddProductDAO"%>
<%@page import="impl.AddProductDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    AddProductDAO udao = new AddProductDAOImpl();

    request.setAttribute("addproduct", udao.getAddProduct());
%>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>My Shop</title>
    
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css">
	
    
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <div id="subheader">
                <div class="contanier">
                    <p>world fastest online place</p>
                    <a href="#">Guest</a><a href="#">Consumer</a><a href="#">Download App</a><a href="#">Help</a>
                </div>
            </div>
            
        <!--==main header==-->
        <div id="main-header">
        <!--log-->
        <div id ="logo">
            <span id="ist">MY</span><span id="iist">Shop.com</span>
        </div>
        <!--==search area==-->
        <div id="search">
            <form action="">
                <input class="search-area" type="text" name="text" placeholder="Search here">
                <input class="search-btn" value="Search" type="submit" name="submit" placeholder="SEARCH">
            </form>
        </div>
        <div id="user-menu">
            <li><a href="Login.jsp">Login</a></li>
            <li><a href="signup.jsp">Register</a></li>
        </div>
        </div>
        <!---===nav bar===--->
        <div id="navigation">
           <div class="ban-top">
	<div class="container">
		<div class="top_nav_left">
			<nav class="navbar navbar-default">
			  <div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
				  <ul class="nav navbar-nav menu__list">
					<li class="active menu__item menu__item--current"><a class="menu__link" href="index.html">Home <span class="sr-only">(current)</span></a></li>
					<li class=" menu__item"><a class="menu__link" href="About%20us.html">About</a></li>
                                        <li class=" menu__item"><a class="menu__link" href="#product">Product</a></li>
                                        
					<li class="dropdown menu__item">
						<a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Men's wear <span class="caret"></span></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="agile_inner_drop_nav_info">
									<div class="col-sm-6 multi-gd-img1 multi-gd-text ">
										<a href="men.html"><img src="Image/top2.jpg" alt=" "/></a>
									</div>
									<div class="col-sm-3 multi-gd-img">
										<ul class="multi-column-dropdown">
											<li><a href="men.html">Clothing</a></li>
											<li><a href="men.html">Wallets</a></li>
											<li><a href="men.html">Footwear</a></li>
											<li><a href="men.html">Watches</a></li>
											<li><a href="men.html">Accessories</a></li>
											<li><a href="men.html">Bags</a></li>
											<li><a href="men.html">Caps & Hats</a></li>
										</ul>
									</div>
									<div class="col-sm-3 multi-gd-img">
										<ul class="multi-column-dropdown">
											<li><a href="men.html">Jewellery</a></li>
											<li><a href="men.html">Sunglasses</a></li>
											<li><a href="men.html">Perfumes</a></li>
											<li><a href="men.html">Beauty</a></li>
											<li><a href="men.html">Shirts</a></li>
											<li><a href="men.html">Sunglasses</a></li>
											<li><a href="men.html">Swimwear</a></li>
										</ul>
									</div>
									<div class="clearfix"></div>
								</div>
							</ul>
					</li>
					<li class="dropdown menu__item">
						<a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Women's wear <span class="caret"></span></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="agile_inner_drop_nav_info">
									<div class="col-sm-3 multi-gd-img">
										<ul class="multi-column-dropdown">
											<li><a href="women.html">Clothing</a></li>
											<li><a href="women.html">Wallets</a></li>
											<li><a href="women.html">Footwear</a></li>
											<li><a href="women.html">Watches</a></li>
											<li><a href="women.html">Accessories</a></li>
											<li><a href="women.html">Bags</a></li>
											<li><a href="women.html">Caps & Hats</a></li>
										</ul>
									</div>
									<div class="col-sm-3 multi-gd-img">
										<ul class="multi-column-dropdown">
											<li><a href="women.html">Jewellery</a></li>
											<li><a href="women.html">Sunglasses</a></li>
											<li><a href="women.html">Perfumes</a></li>
											<li><a href="women.html">Beauty</a></li>
											<li><a href="women.html">Shirts</a></li>
											<li><a href="women.html">Sunglasses</a></li>
											<li><a href="women.html">Swimwear</a></li>
										</ul>
									</div>
									<div class="col-sm-6 multi-gd-img multi-gd-text ">
										<a href="women.html"><img src="Image/top1.jpg" alt=" "/></a>
									</div>
									<div class="clearfix"></div>
								</div>
							</ul>
					</li>
					
					<li class=" menu__item"><a class="menu__link" href="Contact%20us.html">Contact</a></li>
				  </ul>
				</div>
			  </div>
			</nav>	
		</div>
		
		<div class="clearfix"></div>
	</div>
</div> 
        </div>
        
        <!--==home-slider==-->
        <div class="container-inner" style="margin-top: 165px;">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="Image/Autumn%20Winter.jpg" alt="" style="width:100%;">
        <div class="carousel-caption">
        </div>
      </div>

      <div class="item">
        <img src="Image/beauty%20mass%20.jpg" alt="" style="width:100%;">
        <div class="carousel-caption">
        </div>
      </div>
    
      <div class="item">
        <img src="Image/MEMORY%20CARD.jpg" alt="" style="width:100%;">
        <div class="carousel-caption">
        </div>
      </div>
      
      <div class="item">
        <img src="Image/RealMe1.jpg" alt="" style="width:100%;">
        <div class="carousel-caption">
        </div>
      </div>
      
      <div class="item">
        <img src="Image/samsung%20galaxy%20note9.jpg" alt="" style="width:100%;">
        <div class="carousel-caption">
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

       
        <!--==category box==-->
        <div class="container" style="margin-top: 120px;">
            <div id="heading-block">
                <h3>Category</h3>
            </div>
            <!---1st catbox--->
            <a href="#">
                <div class="catbox">
                    <img src="Image/cat1.jpg" alt="Men-fashion">
                    <span>Men Fashion</span>
                </div>
            </a>
            <!---2nd catbox--->
            <a href="#">
                <div class="catbox">
                    <img src="Image/cat5.jpg" alt="Men-fashion">
                    <span>Women Fashion</span>
                </div>
            </a>
            <!---third catbox--->
            <a href="#">
                <div class="catbox">
                    <img src="Image/whey.jpg" alt="Men-fashion">
                    <span>Protein</span>
                </div>
            </a>
            <!---fourth catbox--->
            <a href="#">
                <div class="catbox">
                    <img src="Image/Mobile/OnePlus%206.jpg" alt="Men-fashion">
                    <span>Mobile</span>
                </div>
             </a>
            <!---fifth catbox--->
            <a href="#">
                <div class="catbox">
                    <img src="Image/cat3.jpg" alt="Men-fashion">
                    <span>Ladies Bags</span>
                </div>
            </a>
            <br>
            <br>
            <br>
            <!---HEADING OF CATEGORY-->
            <div id="heading-block">
                <h2>Products</h2>
            </div>
            
            
            <div id="product" class="prod-container">
                    <div class="container-fluid" >
                        <div class="row">
        
                            <c:forEach items="${addproduct}" var="x" end="8">
                                <div class="col-sm-3 ">
                                    <img style="width:250px; height: 100px;" class="thumbnail" src="${x.getImagePath()}" alt="">
                                        <h3>${x.getName()}</h3>
                                        <a href="ViewSingleProduct.jsp?id=${x.getId()}" class="btn btn-primary">View Product</a>
                                       <hr>
                                    </div>
                            
                            </c:forEach>
                        </div>


                    </div>
                </div>
                
               
                <div id="heading-block">
                <h2>SmartPhone</h2>
                </div>
    
                <a href="#">
                <div class="catboxs">
                    <img src="Image/Mobile/Apple%20iPhone%20X.jpg" alt="Smartphone">
                    <span>Apple IPhoneX</span>
                </div>
            </a>
            <!---2nd catbox--->
            <a href="#">
                <div class="catboxs">
                    <img src="Image/Mobile/Mi%20A2%20(Gold,%2064GB).jpg" alt="Smartphone">
                    <span>Mi A2</span>
                </div>
            </a>
            <!---third catbox--->
            <a href="#">
                <div class="catboxs">
                   <img src="Image/Mobile/Vivo%20NEXjpg.jpg" alt="Smartphone">
                    <span>Vivo Nex</span>
                </div>
            </a>
            <!---fourth catbox--->
            <a href="#">
                <div class="catboxs">
                    <img src="Image/Mobile/Oppo%20F9%20Pro.jpg" alt="Smartphone">
                    <span>Oppo F9</span>
                </div>
             </a>
            <!---fifth catbox--->
            <a href="#">
                <div class="catboxs">
                    <img src="Image/Mobile/Huawei%20P20%20Pro%20Blue.jpg" alt="Smartphone">
                    <span>Huawei P20 Pro Blue</span>
                </div>
            </a>
                
            </div>
            
            
            <div class="container">
                <div id="heading-blocks">
                    <h2>Offer</h2>
                </div>
                <!--offer-boxes-->
                <div class="offer">
                    <a href="#"><img src="Image/offer1.JPG"></a>
                </div>
                <div class="offer">
                    <a href="#"><img src="Image/offer2.JPG"></a>
                </div>
                <div class="offer">
                    <a href="#"><img src="Image/offer3.JPG"></a>
                </div>
            </div>

        </div>
        
        <!--   FOOTER START================== -->
    <br>
    <footer class="footer">
    <div class="container">
        <div class="row">
        <div class="col-sm-3">
            <h4 class="title">PARMOD KUMAR</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin suscipit, libero a molestie consectetur, sapien elit lacinia mi.</p>
            <ul class="social-icon">
            <a href="#" class="social"><i class="fa fa-facebook" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-instagram" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-youtube-play" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-google" aria-hidden="true"></i></a>
            <a href="#" class="social"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
            </ul>
            </div>
        <div class="col-sm-3">
            <h4 class="title">My Account</h4>
            <span class="acount-icon">          
            <a href="#"><i class="fa fa-heart" aria-hidden="true"></i> Wish List</a>
            <a href="#"><i class="fa fa-cart-plus" aria-hidden="true"></i> Cart</a>
            <a href="#"><i class="fa fa-user" aria-hidden="true"></i> Profile</a>
            <a href="#"><i class="fa fa-globe" aria-hidden="true"></i> Language</a>           
          </span>
            </div>
        <div class="col-sm-3">
            <h4 class="title">Category</h4>
            <div class="category">
            <a href="men.html">men</a>
            <a href="women.html">women</a>
            <a href="men.html">boy</a>
            <a href="women.html">girl</a>
            <a href="women.html">bag</a>
            <a href="men.html">T-shirt</a>
            <a href="women.html">top</a>
            <a href="men.html">shoes</a>
            <a href="#">glass</a>
            <a href="#">kit</a>
            <a href="#">baby dress</a>
            <a href="women.html">kurti</a>           
            </div>
            </div>
        <div class="col-sm-3">
            <h4 class="title">Payment Methods</h4>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
            <ul class="payment">
            <li><a href="#"><i class="fa fa-cc-amex" aria-hidden="true"></i></a></li>
            <li><a href="#"><i class="fa fa-credit-card" aria-hidden="true"></i></a></li>            
            <li><a href="#"><i class="fa fa-paypal" aria-hidden="true"></i></a></li>
            <li><a href="#"><i class="fa fa-cc-visa" aria-hidden="true"></i></a></li>
            </ul>
            </div>
        </div>
        <hr>
        
        <div class="row text-center"> © 2017. Made with  by P.K.</div>
        </div>
        
        
    </footer>
    
    </div>
</body>
</html>