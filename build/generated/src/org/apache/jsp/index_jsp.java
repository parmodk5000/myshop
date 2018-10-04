package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.AddProduct;
import dao.AddProductDAO;
import impl.AddProductDAOImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items_end = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items_end.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    AddProductDAO udao = new AddProductDAOImpl();

    request.setAttribute("addproduct", udao.getAddProduct());

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>My Shop</title>\n");
      out.write("    \n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"subheader\">\n");
      out.write("                <div class=\"contanier\">\n");
      out.write("                    <p>world fastest online place</p>\n");
      out.write("                    <a href=\"#\">Guest</a><a href=\"#\">Consumer</a><a href=\"#\">Download App</a><a href=\"#\">Help</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        <!--==main header==-->\n");
      out.write("        <div id=\"main-header\">\n");
      out.write("        <!--log-->\n");
      out.write("        <div id =\"logo\">\n");
      out.write("            <span id=\"ist\">MY</span><span id=\"iist\">Shop.com</span>\n");
      out.write("        </div>\n");
      out.write("        <!--==search area==-->\n");
      out.write("        <div id=\"search\">\n");
      out.write("            <form action=\"\">\n");
      out.write("                <input class=\"search-area\" type=\"text\" name=\"text\" placeholder=\"Search here\">\n");
      out.write("                <input class=\"search-btn\" type=\"submit\" name=\"submit\" placeholder=\"SEARCH\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"user-menu\">\n");
      out.write("            <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"signup.jsp\">Register</a></li>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <!---===nav bar===--->\n");
      out.write("        <div id=\"navigation\">\n");
      out.write("           <div class=\"ban-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"top_nav_left\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t  <div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse menu--shylock\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t  <ul class=\"nav navbar-nav menu__list\">\n");
      out.write("\t\t\t\t\t<li class=\"active menu__item menu__item--current\"><a class=\"menu__link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\" menu__item\"><a class=\"menu__link\" href=\"About%20us.html\">About</a></li>\n");
      out.write("                                        <li class=\" menu__item\"><a class=\"menu__link\" href=\"#product\">Product</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<li class=\"dropdown menu__item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Men's wear <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"agile_inner_drop_nav_info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 multi-gd-img1 multi-gd-text \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"men.html\"><img src=\"Image/top2.jpg\" alt=\" \"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Perfumes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Beauty</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"men.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown menu__item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Women's wear <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"agile_inner_drop_nav_info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Wallets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Footwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Perfumes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Beauty</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"women.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 multi-gd-img multi-gd-text \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"women.html\"><img src=\"Image/top1.jpg\" alt=\" \"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\" menu__item\"><a class=\"menu__link\" href=\"Contact%20us.html\">Contact</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</nav>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div> \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--==home-slider==-->\n");
      out.write("        <div class=\"container-inner\" style=\"margin-top: 165px;\">\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"Image/Autumn%20Winter.jpg\" alt=\"\" style=\"width:100%;\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"Image/beauty%20mass%20.jpg\" alt=\"\" style=\"width:100%;\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"Image/MEMORY%20CARD.jpg\" alt=\"\" style=\"width:100%;\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"Image/RealMe1.jpg\" alt=\"\" style=\"width:100%;\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"Image/samsung%20galaxy%20note9.jpg\" alt=\"\" style=\"width:100%;\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <!--==category box==-->\n");
      out.write("        <div class=\"container\" style=\"margin-top: 120px;\">\n");
      out.write("            <div id=\"heading-block\">\n");
      out.write("                <h3>Category</h3>\n");
      out.write("            </div>\n");
      out.write("            <!---1st catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catbox\">\n");
      out.write("                    <img src=\"Image/cat1.jpg\" alt=\"Men-fashion\">\n");
      out.write("                    <span>Men Fashion</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---2nd catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catbox\">\n");
      out.write("                    <img src=\"Image/cat5.jpg\" alt=\"Men-fashion\">\n");
      out.write("                    <span>Women Fashion</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---third catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catbox\">\n");
      out.write("                    <img src=\"Image/whey.jpg\" alt=\"Men-fashion\">\n");
      out.write("                    <span>Protein</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---fourth catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catbox\">\n");
      out.write("                    <img src=\"Image/Mobile/OnePlus%206.jpg\" alt=\"Men-fashion\">\n");
      out.write("                    <span>Mobile</span>\n");
      out.write("                </div>\n");
      out.write("             </a>\n");
      out.write("            <!---fifth catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catbox\">\n");
      out.write("                    <img src=\"Image/cat3.jpg\" alt=\"Men-fashion\">\n");
      out.write("                    <span>Ladies Bags</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <!---HEADING OF CATEGORY-->\n");
      out.write("            <div id=\"heading-block\">\n");
      out.write("                <h2>Products</h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div id=\"product\" class=\"prod-container\">\n");
      out.write("                    <div class=\"container-fluid\" >\n");
      out.write("                        <div class=\"row\">\n");
      out.write("        \n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <div id=\"heading-block\">\n");
      out.write("                <h2>SmartPhone</h2>\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("                <a href=\"#\">\n");
      out.write("                <div class=\"catboxs\">\n");
      out.write("                    <img src=\"Image/Mobile/Apple%20iPhone%20X.jpg\" alt=\"Smartphone\">\n");
      out.write("                    <span>Apple IPhoneX</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---2nd catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catboxs\">\n");
      out.write("                    <img src=\"Image/Mobile/Mi%20A2%20(Gold,%2064GB).jpg\" alt=\"Smartphone\">\n");
      out.write("                    <span>Mi A2</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---third catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catboxs\">\n");
      out.write("                   <img src=\"Image/Mobile/Vivo%20NEXjpg.jpg\" alt=\"Smartphone\">\n");
      out.write("                    <span>Vivo Nex</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <!---fourth catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catboxs\">\n");
      out.write("                    <img src=\"Image/Mobile/Oppo%20F9%20Pro.jpg\" alt=\"Smartphone\">\n");
      out.write("                    <span>Oppo F9</span>\n");
      out.write("                </div>\n");
      out.write("             </a>\n");
      out.write("            <!---fifth catbox--->\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"catboxs\">\n");
      out.write("                    <img src=\"Image/Mobile/Huawei%20P20%20Pro%20Blue.jpg\" alt=\"Smartphone\">\n");
      out.write("                    <span>Huawei P20 Pro Blue</span>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"heading-blocks\">\n");
      out.write("                    <h2>Offer</h2>\n");
      out.write("                </div>\n");
      out.write("                <!--offer-boxes-->\n");
      out.write("                <div class=\"offer\">\n");
      out.write("                    <a href=\"#\"><img src=\"Image/offer1.JPG\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"offer\">\n");
      out.write("                    <a href=\"#\"><img src=\"Image/offer2.JPG\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"offer\">\n");
      out.write("                    <a href=\"#\"><img src=\"Image/offer3.JPG\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--   FOOTER START================== -->\n");
      out.write("    <br>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">PARMOD KUMAR</h4>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin suscipit, libero a molestie consectetur, sapien elit lacinia mi.</p>\n");
      out.write("            <ul class=\"social-icon\">\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">My Account</h4>\n");
      out.write("            <span class=\"acount-icon\">          \n");
      out.write("            <a href=\"#\"><i class=\"fa fa-heart\" aria-hidden=\"true\"></i> Wish List</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i> Cart</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> Profile</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i> Language</a>           \n");
      out.write("          </span>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">Category</h4>\n");
      out.write("            <div class=\"category\">\n");
      out.write("            <a href=\"men.html\">men</a>\n");
      out.write("            <a href=\"women.html\">women</a>\n");
      out.write("            <a href=\"men.html\">boy</a>\n");
      out.write("            <a href=\"women.html\">girl</a>\n");
      out.write("            <a href=\"women.html\">bag</a>\n");
      out.write("            <a href=\"men.html\">T-shirt</a>\n");
      out.write("            <a href=\"women.html\">top</a>\n");
      out.write("            <a href=\"men.html\">shoes</a>\n");
      out.write("            <a href=\"#\">glass</a>\n");
      out.write("            <a href=\"#\">kit</a>\n");
      out.write("            <a href=\"#\">baby dress</a>\n");
      out.write("            <a href=\"women.html\">kurti</a>           \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">Payment Methods</h4>\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>\n");
      out.write("            <ul class=\"payment\">\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-cc-amex\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-credit-card\" aria-hidden=\"true\"></i></a></li>            \n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-paypal\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-cc-visa\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <div class=\"row text-center\"> © 2017. Made with  by P.K.</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addproduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    _jspx_th_c_forEach_0.setEnd(8);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-sm-3 \">\n");
          out.write("                                    <img style=\"width:250px; height: 100px;\" class=\"thumbnail\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getImagePath()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                        <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                        <a href=\"ViewSingleProduct.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">View Product</a>\n");
          out.write("                                       <hr>\n");
          out.write("                                    </div>\n");
          out.write("                            \n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items_end.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
