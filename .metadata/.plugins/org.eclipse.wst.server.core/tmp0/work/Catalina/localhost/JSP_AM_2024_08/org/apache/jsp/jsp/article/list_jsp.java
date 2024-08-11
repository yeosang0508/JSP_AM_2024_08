/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-08-11 11:54:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.article;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;
import java.util.Map;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

List<Map<String, Object>> articleRows = (List<Map<String, Object>>) request.getAttribute("articleRows");

int cPage = (int) request.getAttribute("page");
int totalPage = (int) request.getAttribute("totalPage");
int totalCnt = (int) request.getAttribute("totalCnt");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시물 목록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<h2>게시물 목록</h2>\r\n");
      out.write("\r\n");
      out.write("	<a href=\"../home/main\">메인 페이지로 </a>\r\n");
      out.write("	<div>\r\n");
      out.write("		총 게시글 수 :\r\n");
      out.write("		");
      out.print(totalCnt);
      out.write("\r\n");
      out.write("		개\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<table style=\"border-collapse: collapse; border-color: green;\"\r\n");
      out.write("		border=\"1px\">\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>번호</th>\r\n");
      out.write("				<th>날짜</th>\r\n");
      out.write("				<th>제목</th>\r\n");
      out.write("				<th>내용</th>\r\n");
      out.write("				<th>삭제</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody>\r\n");
      out.write("			");

			for (Map<String, Object> articleRow : articleRows) {
			
      out.write("\r\n");
      out.write("			<tr style=\"text-align: center;\">\r\n");
      out.write("				<td>");
      out.print(articleRow.get("id"));
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(articleRow.get("regDate"));
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(articleRow.get("title"));
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(articleRow.get("body"));
      out.write("</td>\r\n");
      out.write("				<td><a href=\"doDelete?id=");
      out.print(articleRow.get("id"));
      out.write("\">del</a></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write(".page {\r\n");
      out.write("	font-size: 1.4rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page>a {\r\n");
      out.write("	color: black;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page>a.cPage {\r\n");
      out.write("	color: red;\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"page\">\r\n");
      out.write("		");

		for (int i = 1; i <= totalPage; i++) {
		
      out.write("\r\n");
      out.write("		<a class=\"");
      out.print(cPage == i ? "cPage" : "");
      out.write("\" href=\"list?page=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
