package com.simpleway.frst.util;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;

/**
 * @author xiongfeixiang
 * @title PreconditionsUtil
 * @date 2017/9/28 14:38
 * @since v1.0.0
 */
public class PreconditionsUtil {
    private static Logger logger = LoggerFactory.getLogger(PreconditionsUtil.class);

    public PreconditionsUtil() {
    }

    public static <T> T checkNotNull(T obj, String errMsg) {
        try {
            Preconditions.checkNotNull(obj, errMsg);
            if (obj instanceof Collection && ((Collection) obj).isEmpty()) {
                throw new NullPointerException(errMsg);
            } else if (obj instanceof Map && ((Map) obj).isEmpty()) {
                throw new NullPointerException(errMsg);
            } else {
                if (obj instanceof String) {
                    String e = (String) obj;
                    if (e.trim().length() == 0) {
                        throw new NullPointerException(errMsg);
                    }
                }

                return obj;
            }
        } catch (NullPointerException var3) {
            logger.error(var3.getMessage());
            throw var3;
        }
    }

    public static void checkState(boolean expression, String errMsg) {
        try {
            Preconditions.checkState(expression, errMsg);
        } catch (IllegalStateException var3) {
            logger.error(var3.getMessage());
            throw var3;
        }
    }

    public static void checkResultIsONE(Integer count, String errMsg) {
        try {
            Preconditions.checkState(count.intValue() == 1, errMsg);
        } catch (IllegalStateException var3) {
            logger.error(var3.getMessage());
            throw var3;
        }
    }

    public static void checkResultGatherThanZERO(Integer count, String errMsg) {
        try {
            Preconditions.checkState(count.intValue() > 0, errMsg);
        } catch (IllegalStateException var3) {
            logger.error(var3.getMessage());
            throw var3;
        }
    }
}
