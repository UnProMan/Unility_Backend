package unility.backend.system.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // Global
    INTERNAL_SERVER_ERROR(500, "내부 서버 오류가 발생했습니다."),
    GLOBAL_INVALID_TOKEN_ERROR(401, "토큰이 유효하지 않습니다."),
    GLOBAL_TOKEN_EXPIRED_ERROR(401, "토큰이 만료되었습니다. 다시 로그인해주세요."),
    GLOBAL_ACCESS_DENIED(401, "권한이 없습니다."),
    GLOBAL_NOT_VALID_DATA(400, "입력된 데이터가 잘못되었습니다."),
    GLOBAL_NOT_VALID_JSON_BODY(400, "입력된 Json Body가 잘못되었습니다."),
    GLOBAL_NOT_FOUND_FILE(404, "파일을 찾을 수 없습니다."),
    GLOBAL_FILE_ACCESS_ERROR(500, "입출력 작업 중 오류가 발생했습니다."),
    GLOBAL_GENERAL_SECURITY_ERROR(500, "보안 작업 중 오류가 발생했습니다."),
    ;

    private final int status;
    private String message;

    ErrorCode(final int status, String message) {
        this.status = status;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
