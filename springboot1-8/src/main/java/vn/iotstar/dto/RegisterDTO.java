package vn.iotstar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterDTO {
    @Email @NotBlank(message = "Email không được trống")
    private String email;

    @NotBlank(message = "Họ tên không được trống")
    private String fullName;

    @NotBlank(message = "Mật khẩu không được trống")
    @Size(min = 6, max = 100, message = "Mật khẩu ít nhất 6 ký tự")
    private String password;

    @NotBlank(message = "Xác nhận mật khẩu không được trống")
    private String confirmPassword;
}
