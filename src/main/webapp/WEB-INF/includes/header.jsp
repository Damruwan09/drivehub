<%@ page import="com.drivehub.util.constant.ConstantStrings" %>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title><%= ConstantStrings.BRAND_NAME%></title>

<!-- Font Icon -->
<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

<style>
    .alert {
      padding: 20px;
      background-color: #f44336;
      color: white;
    }

    .success {
      padding: 20px;
      background-color: #32a852; /* Green */
      color: white;
      margin-bottom: 15px;
    }

    .closebtn {
      margin-left: 15px;
      color: white;
      font-weight: bold;
      float: right;
      font-size: 22px;
      line-height: 20px;
      cursor: pointer;
      transition: 0.3s;
    }

    .closebtn:hover {
      color: black;
    }
    .fa {
      margin-left: -12px;
      margin-right: 8px;
      visibility:hidden;
    }
</style>