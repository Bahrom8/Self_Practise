package day08_practices;

public class HTTP_Solution_2 {
    public static void main(String[] args) {
        int statusCode = 200;
        String code;

        switch (statusCode) {
            case 200:
                code = "OK";
                break;
            case 201:
                code = "Created";
                break;
            case 202:
                code = "Accepted";
                break;
            case 301:
                code = "Moved Permanently";
                break;
            case 303:
                code = "See Other";
                break;
            case 304:
                code = "Not Modified";
                break;
            case 307:
                code = "Temporary Redirect";
                break;
            case 400:
                code = "Bad Request";
                break;
            case 401:
                code = "Unauthorized";
                break;
            case 403:
                code = "Forbidden";
                break;
            case 404:
                code = "Not Found";
                break;
            case 410:
                code = "Gone";
                break;
            case 500:
                code = "Internal Server Error";
                break;
            case 503:
                code = "Service Unavailable";
                break;
            default:
                code = "Invalid";

        }

        System.out.println(code);
    }
}

/*
HTTP is the protocol that governs communications between web servers
and web clients. Part of the protocol includes a status code returned
by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use the switch statement
 */

