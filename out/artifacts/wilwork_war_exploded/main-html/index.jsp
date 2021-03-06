<!DOCTYPE html>
<html lang="zh">

<head>
    <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="plugins/images/favicon.png">
    <title>公司员工考勤系统</title>
    <!-- Bootstrap Core CSS -->
    <link href="main-html/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Menu CSS -->
    <link href="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
    <!-- toast CSS -->
    <link href="plugins/bower_components/toast-master/css/jquery.toast.css" rel="stylesheet">
    <!-- morris CSS -->
    <link href="plugins/bower_components/morrisjs/morris.css" rel="stylesheet">
    <!-- animation CSS -->
    <link href="main-html/css/animate.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="main-html/css/style.css" rel="stylesheet">
    <!-- color CSS -->
    <link href="main-html/css/colors/blue-dark.css" id="theme" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- Preloader -->
<div class="preloader">
    <div class="cssload-speeding-wheel"></div>
</div>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top m-b-0">
        <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="fa fa-bars"></i></a>
            <div class="top-left-part"><a class="logo" href="index.jsp"><b><img src="plugins/images/pixeladmin-logo.png" alt="home" /></b><span class="hidden-xs"><img src="../plugins/images/pixeladmin-text.png" alt="home" /></span></a></div>
            <ul class="nav navbar-top-links navbar-left m-l-20 hidden-xs">
                <li>
                    <form role="search" class="app-search hidden-xs">
                        <input type="text" placeholder="Search..." class="form-control"> <a href=""><i class="fa fa-search"></i></a>
                    </form>
                </li>
            </ul>
            <ul class="nav navbar-top-links navbar-right pull-right">
                <li>
                    <a class="profile-pic" href="../index.jsp"> <img src="../plugins/images/users/varun.jpg" alt="user-img" width="36" class="img-circle"><b class="hidden-xs">admin</b> </a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-header -->
        <!-- /.navbar-top-links -->
        <!-- /.navbar-static-side -->
    </nav>
    <!-- Left navbar-header -->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse slimscrollsidebar">
            <ul class="nav" id="side-menu">
                <li style="padding: 10px 0 0;">
                    <a href="main" class="waves-effect"><i class="fa fa-clock-o fa-fw" aria-hidden="true"></i><span class="hide-menu">菜单</span></a>
                </li>
                <li>
                    <a href="main-html/profile.html" class="waves-effect"><i class="fa fa-user fa-fw" aria-hidden="true"></i><span class="hide-menu">人员</span></a>
                </li>
                <li>
                    <a href="qian" class="waves-effect"><i class="fa fa-table fa-fw" aria-hidden="true"></i><span class="hide-menu">签到</span></a>
                </li>
                <li>
                    <a href="fontawesome.html" class="waves-effect"><i class="fa fa-font fa-fw" aria-hidden="true"></i><span class="hide-menu">选项</span></a>
                </li>
                <li>
                    <a href="map-google.html" class="waves-effect"><i class="fa fa-globe fa-fw" aria-hidden="true"></i><span class="hide-menu">选项</span></a>
                </li>
                <li>
                    <a href="blank.html" class="waves-effect"><i class="fa fa-columns fa-fw" aria-hidden="true"></i><span class="hide-menu">选项</span></a>
                </li>
                <li>
                    <a href="404.html" class="waves-effect"><i class="fa fa-info-circle fa-fw" aria-hidden="true"></i><span class="hide-menu">选项</span></a>
                </li>
            </ul>
        </div>
    </div>
    <!-- Left navbar-header end -->
    <!-- Page Content -->
    <div id="page-wrapper">
        <div class="container-fluid">
            <div class="row bg-title">
                <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                    <h4 class="page-title">考勤！！！</h4> </div>
                <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                    <ol class="breadcrumb">
                        <li><a href="#">公司考勤系统</a></li>
                    </ol>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- row -->
            <div class="row">
                <!--col -->
                <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                    <div class="white-box">
                        <div class="col-in row">
                            <div class="col-md-6 col-sm-6 col-xs-6"> <i data-icon="E" class="linea-icon linea-basic"></i>
                                <h5 class="text-muted vb">总人数</h5> </div>
                            <div class="col-md-6 col-sm-6 col-xs-6">
                                <h3 class="counter text-right m-t-15 text-danger">1</h3> </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="progress">
                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"> <span class="sr-only">40% Complete (success)</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.col -->
                <!--col -->
                <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                    <div class="white-box">
                        <div class="col-in row">
                            <div class="col-md-6 col-sm-6 col-xs-6"> <i class="linea-icon linea-basic" data-icon="&#xe01b;"></i>
                                <h5 class="text-muted vb">已签到</h5> </div>
                            <div class="col-md-6 col-sm-6 col-xs-6">
                                <h3 class="counter text-right m-t-15 text-megna">0</h3> </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="progress">
                                    <div class="progress-bar progress-bar-megna" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"> <span class="sr-only">40% Complete (success)</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.col -->
                <!--col -->
                <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                    <div class="white-box">
                        <div class="col-in row">
                            <div class="col-md-6 col-sm-6 col-xs-6"> <i class="linea-icon linea-basic" data-icon="&#xe00b;"></i>
                                <h5 class="text-muted vb">未到</h5> </div>
                            <div class="col-md-6 col-sm-6 col-xs-6">
                                <h3 class="counter text-right m-t-15 text-primary">1</h3> </div>
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="progress">
                                    <div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"> <span class="sr-only">40% Complete (success)</span> </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
            <!--row -->
            <div class="row">
                <div class="col-sm-12">
                    <div class="white-box">
                        <h3 class="box-title">签到情况
                            <div class="col-md-2 col-sm-4 col-xs-12 pull-right">
                                <select class="form-control pull-right row b-none">
                                    <option>12月 2019</option>
                                    <option>April 2016</option>
                                    <option>May 2016</option>
                                    <option>June 2016</option>
                                    <option>July 2016</option>
                                </select>
                            </div>
                        </h3>
                        <div class="table-responsive">
                            <table class="table ">
                                <thead>
                                <tr>
                                    <th>NAME</th>
                                    <th>SEX</th>
                                    <th>STATUS</th>
                                    <th>DATE</th>
                                    <th>PRICE</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td class="txt-oflo">${name }</td>
                                    <td>男</td>
                                    <td>${mes }</td>
                                    <td class="txt-oflo">预留</td>
                                    <td><span class="text-success">work</span></td>
                                </tr>
                                </tbody>
                            </table> <a href="#">Check all the sales</a> </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->
        <footer class="footer text-center"> 2020 &copy; 员工签到系统 - willoong <a href="http://localhost:8080/" target="_blank" title="test">test</a> - Collect from <a href="http://localhost:8080/" title="test" target="_blank">test</a> </footer>
    </div>
    <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
<!-- jQuery -->
<script src="plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="main-html/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script src="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
<!--slimscroll JavaScript -->
<script src="main-html/js/jquery.slimscroll.js"></script>
<!--Wave Effects -->
<script src="main-html/js/waves.js"></script>
<!--Counter js -->
<script src="plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
<script src="plugins/bower_components/counterup/jquery.counterup.min.js"></script>
<!--Morris JavaScript -->
<script src="plugins/bower_components/raphael/raphael-min.js"></script>
<script src="plugins/bower_components/morrisjs/morris.js"></script>
<!-- Custom Theme JavaScript -->
<script src="main-html/js/custom.min.js"></script>
<script src="main-html/js/dashboard1.js"></script>
<script src="plugins/bower_components/toast-master/js/jquery.toast.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $.toast({
            heading: '登陆成功',
            text: '欢迎  toast TEST  TEST ',
            position: 'top-right',
            loaderBg: '#ff6849',
            icon: 'info',
            hideAfter: 3500,
            stack: 6
        })
    });
</script>
</body>

</html>
