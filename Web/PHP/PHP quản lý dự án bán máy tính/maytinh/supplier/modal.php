<!-- Logout -->
    <div class="modal fade" id="logout" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <center><h4 class="modal-title" id="myModalLabel">Đăng Xuất ...</h4></center>
                </div>
                <div class="modal-body">
				<div class="container-fluid">
					<h5><center>Tài khoản: <strong><?php echo $user; ?></strong></center></h5>
                </div> 
				</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Đóng</button>
                    <a href="logout.php" class="btn btn-danger"><i class="fa fa-sign-out"></i> Đăng Xuất</a>
                </div>
				
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
<!-- /.modal -->

<!-- My Account -->
    <div class="modal fade" id="account" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<center><h4 class="modal-title" id="myModalLabel">Thay đổi mật khẩu</h4></center>
                </div>
                <div class="modal-body">
				<div class="container-fluid">
					<form method="POST" action="update_account.php">
						<div style="height:10px;"></div>
						<div class="form-group input-group">
							<span class="input-group-addon" style="width:150px;">Tên đăng nhập:</span>
							<input type="text" style="width:350px;" readonly value="<?php echo $srow['username']; ?>" class="form-control" name="username">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" style="width:150px;">Mật khẩu mới:</span>
							<input type="password" style="width:350px;" value="<?php echo $srow['password']; ?>" class="form-control" name="password">
						</div><hr>
						<p>Vui lòng nhập mật khẩu cũ để đổi mật khẩu:</p>
						<div class="form-group input-group">
                                <span class="input-group-addon" style="width:150px;">Mật khẩu cũ:</span>
							<input type="password" style="width:350px;" class="form-control" name="cpass" required>
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon" style="width:150px;">Nhập lại:</span>
							<input type="password" style="width:350px;" class="form-control" name="repass" required>
						</div> 						
				</div>
				</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Đóng</button>
                    <button type="submit" class="btn btn-success"><i class="fa fa-check-square-o"></i> Cập nhật</button>
					</form>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
<!-- /.modal -->

<!-- Edit Profile -->
    <div class="modal fade" id="profile" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<?php
		$cq=mysqli_query($conn,"select * from supplier left join `user` on user.userid=supplier.userid where supplier.userid='".$_SESSION['id']."'");
		$crow=mysqli_fetch_array($cq);
	?>
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <center><h4 class="modal-title" id="myModalLabel">Chỉnh sửa hồ sơ</h4></center>
                </div>
                <div class="modal-body">
				<div class="container-fluid">
                    <form role="form" method="POST" action="save_profile.php<?php echo '?id='.$_SESSION['id']; ?>" enctype="multipart/form-data">
						<div class="container-fluid">
						<div style="height:15px;"></div>
						<div class="form-group input-group">
                            <span style="width:150px;" class="input-group-addon">Công ty:</span>
                            <input type="text" style="width:330px; text-transform:capitalize;" class="form-control" name="cname" value="<?php echo ucwords($crow['company_name']); ?>">
                        </div>
						<div class="form-group input-group">
                            <span style="width:150px;" class="input-group-addon">Địa chỉ:</span>
                            <input type="text" style="width:330px; text-transform:capitalize;" class="form-control" name="address" value="<?php echo ucwords($crow['company_address']); ?>">
                        </div>
						<div class="form-group input-group">
                            <span style="width:150px;" class="input-group-addon">Thông tin liên lạc:</span>
                            <input type="text" style="width:330px;" class="form-control" name="contact" value="<?php echo $crow['contact']; ?>">
                        </div>
						</div>
				</div>                
				</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Đóng</button>
                    <button type="submit" class="btn btn-success"><i class="fa fa-check-square-o"></i> Cập nhật</button>
					</form>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
<!-- /.modal -->