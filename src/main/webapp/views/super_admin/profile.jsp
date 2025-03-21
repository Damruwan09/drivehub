<%@  page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@  page import="java.util.*" %>

<%
    HttpSession sessionObj = request.getSession(false);
    Integer userId = -1;
    if (sessionObj != null) {
        userId = (Integer) sessionObj.getAttribute("superAdminId");
        if(userId == null){
            response.sendRedirect("../../index.jsp");
        }
    } else {
        response.sendRedirect("../../index.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="includes/header.jsp" />
        <style>
            .overlay {
               position: absolute;
               top: 0;
               left: 0;
               width: 100%;
               height: 100%;
               background: rgba(255, 255, 255, 0.7);
               display: flex;
               justify-content: center;
               align-items: center;
               z-index: 10;
           }
        </style>
    </head>
    <body id="page-top" style="padding-top: 110px; padding-bottom: 10px;">
        <!-- Navigation-->
        <jsp:include page="nav.jsp" />

        <div class="alert alert-success custom-alert" role="alert" id="success_alert"></div>
        <div class="alert alert-danger custom-alert" role="alert" id="error_alert"></div>

        <!-- Profile Form-->
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="popupFormLabel">Profile</h5>
                </div>
                <div class="modal-body position-relative">
                    <!-- Overlay (Hidden Initially) -->
                    <div id="formOverlay" class="overlay d-none">
                        <i class="fa fa-spinner fa-spin" style="font-size:35px;"></i>
                    </div>
                    <form id="updateProfile">
                        <input type="hidden" name="action" value="update_profile">
                        <input type="hidden" name="userId" id="userId">
                        <div class="mb-3">
                            <label for="admin_name" class="form-label">Name</label>
                            <input type="text" class="form-control" id="admin_name" name="name" placeholder="Enter your name" oninput="enableSubmitButton()">
                            <span class="error_text" id="super_admin_profile_error_0"></span>
                        </div>

                        <div class="mb-3">
                            <label for="admin_nic" class="form-label">NIC Number</label>
                            <input type="text" class="form-control" id="admin_nic" name="nic" placeholder="Enter your NIC">
                            <span class="error_text" id="super_admin_profile_error_5"></span>
                        </div>

                        <div class="mb-3">
                            <label for="admin_email" class="form-label">Email</label>
                            <input type="email" class="form-control" id="admin_email" name="email" placeholder="Enter your email" oninput="enableSubmitButton()">
                            <span class="error_text" id="super_admin_profile_error_1"></span>
                        </div>

                        <div class="mb-3">
                            <label for="admin_phone" class="form-label">Phone</label>
                            <input type="email" class="form-control" id="admin_phone" name="phone" placeholder="Enter your phone" oninput="enableSubmitButton()">
                            <span class="error_text" id="super_admin_profile_error_2"></span>
                        </div>

                        <div class="mb-3">
                            <label for="admin_address" class="form-label">Address</label>
                            <input type="text" class="form-control" id="admin_address" name="address" placeholder="Enter your address" oninput="enableSubmitButton()">
                            <span class="error_text" id="super_admin_profile_error_3"></span>
                        </div>

                        <div class="mb-3">
                            <label for="admin_username" class="form-label">Username</label>
                            <input type="text" class="form-control" id="admin_username" name="username" placeholder="Enter your username" readonly>
                        </div>

                        <div class="mb-3">
                            <label for="admin_new_password" class="form-label">New Password</label>
                            <input type="password" class="form-control" id="admin_new_password" name="new_password" placeholder="Enter your New Password" oninput="enableSubmitButton()">
                            <span class="error_text" id="super_admin_profile_error_4"></span>
                        </div>

                        <button type="button" class="btn btn-primary" onclick="openPasswordModel('super_admin_profile')" id="saveProfile">Update</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Password Confirmation-->
        <div class="modal fade" id="confirmPasswordModel" tabindex="-1" aria-labelledby="popupFormLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" style="max-width: 400px;">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="popupFormLabel2">Confirm Your Current Password</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form id="confirmPasswordForm">
                            <input type="hidden" name="action" value="confirm_password" required>
                            <input type="hidden" name="u_id" id="u_id" required>

                            <div class="mb-3">
                                <label for="admin_new_password" class="form-label">Current Password</label>
                                <input type="password" class="form-control" id="confirm_password" name="confirm_password" placeholder="Enter your Current Password">
                                <span class="error_text" id="profile_confirm_pass_error"></span>
                            </div>

                            <button type="submit" class="btn btn-success me-2" style="width: 40%;">
                                <i class="fa fa-spinner fa-spin" id="cp_btn_loading" style="display: none; margin-right: 5px;"></i>Confirm
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <jsp:include page="../../WEB-INF/includes/footer.jsp" />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>var userId = <%= userId %>;</script>
        <jsp:include page="../../js/user.js" />
        <jsp:include page="../../js/validations/validation.js" />

    </body>
</html>
