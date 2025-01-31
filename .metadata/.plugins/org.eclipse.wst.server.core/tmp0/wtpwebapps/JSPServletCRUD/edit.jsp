<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Edit Student</h2>

        <%
            int id = Integer.parseInt(request.getParameter("id"));
            String fname = "", lname = "", email = "", mobile = "", gender = "", password = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservletcrud", "root", "");
                String sql = "SELECT * FROM students WHERE id=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    fname = rs.getString("fname");
                    lname = rs.getString("lname");
                    email = rs.getString("email");
                    mobile = rs.getString("mobile");
                    gender = rs.getString("gender");
                    password = rs.getString("password");
                }
                
                rs.close();
                pst.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>

        <form action="StudServlet" method="post">
            <input type="hidden" name="id" value="<%= id %>">
            <input type="hidden" name="action" value="edit">

            <div class="mb-3">
                <label for="fname" class="form-label">First Name:</label>
                <input type="text" class="form-control" id="fname" name="fname" value="<%= fname %>" required>
            </div>
            <div class="mb-3">
                <label for="lname" class="form-label">Last Name:</label>
                <input type="text" class="form-control" id="lname" name="lname" value="<%= lname %>" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" class="form-control" id="email" name="email" value="<%= email %>" required>
            </div>
            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile:</label>
                <input type="text" class="form-control" id="mobile" name="mobile" value="<%= mobile %>" required>
            </div>
            <div class="mb-3">
                <label for="gender" class="form-label">Gender:</label>
                <select class="form-control" id="gender" name="gender" required>
                    <option value="Male" <%= "Male".equals(gender) ? "selected" : "" %>>Male</option>
                    <option value="Female" <%= "Female".equals(gender) ? "selected" : "" %>>Female</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" class="form-control" id="password" name="password" value="<%= password %>" required>
            </div>

            <button type="submit" class="btn btn-primary">Update</button>
        </form>
    </div>
</body>
</html>
