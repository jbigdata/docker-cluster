package com.wanliang.docker.util;

import com.wanliang.docker.model.Bind;
import com.wanliang.docker.model.Node;
import com.wanliang.docker.model.Port;
import com.wanliang.docker.model.ui.UIResult;
import com.wanliang.docker.model.ui.UiError;
import com.wanliang.docker.result.ResultCode;
import com.wanliang.docker.result.ServiceCallResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.joda.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

/**
 * some utilities
 */
public final class UiUtils {

    static void convertCode(ServiceCallResult res, UiError error) {
        error.setCode((res.getCode() == ResultCode.OK? OK : HttpStatus.INTERNAL_SERVER_ERROR).value());
    }

    static ResponseEntity<Object> createResponse(ServiceCallResult result) {
        ResultCode code = result.getCode();

        String message = code + " " + (result.getMessage() == null ? "" : result.getMessage());
        if(code == ResultCode.OK) {
            UIResult res = new UIResult();
            res.setMessage(message);
            res.setCode(OK.value());
            return new ResponseEntity<Object>(res, OK);
        } else {
            UiError err = new UiError();
            err.setMessage(message);
            err.setCode(INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<Object>(err, OK);
        }
    }

    static String portsToString(List<Port> ports) {
        StringBuilder sb = new StringBuilder();
        for(Port port: ports) {
            if(sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(port.getType()).append('\u00A0');
            sb.append(port.getIp()).append(':');
            sb.append(port.getPrivatePort());
            int publicPort = port.getPublicPort();
            if(publicPort != 0) {
                sb.append("\u00A0\u21D2\u00A0");
                sb.append(publicPort);
            }
        }
        return sb.toString();
    }

    public static boolean calculateIsRun(String status) {
        return status != null && status.contains("Up");
    }

    public static Double convertToGB(Long memory) {
        return Math.round(memory * 100 / (1024 * 1024 * 1024)) / 100d;
    }

    public static Long convertToKb(Long memory) {
        return new Long(Math.round(memory/ 1024));
    }

    public static Double convertToMb(Long memory) {
        return Math.round(memory * 100 / (1024 * 1024)) / 100d;
    }

    public static Double convertToMb(Integer memory) {
        return convertToMb(memory.longValue());
    }

    public static List<String> bindsToString(Bind[] binds) {
        List<String> list = new ArrayList<>();
        for (Bind bind : binds) {
            list.add(bind.toString());
        }
        return list;
    }

    public static String convertToStringFromJiffies(Long jiffies) {
        LocalTime timeOfDay = LocalTime.fromMillisOfDay(jiffies / 1000_000L);
        String time = timeOfDay.toString("HH:mm:ss");
        return time;
    }

    public static String NodeTostring(Node node) {
        return "Name: " + node.getName() + "; Address: " + node.getAddr();
    }
}
