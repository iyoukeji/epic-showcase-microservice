package com.iyoukeji.epic.common.domain.model;

import com.iyoukeji.epic.common.exception.InvalidArgumentException;
import com.iyoukeji.epic.common.exception.InvalidStateException;

import java.math.BigDecimal;

public class AssertionConcern {

    /**
     * 断言参数是相等
     *
     * @param anObject1 参数对象1
     * @param anObject2 参数对象2
     * @param aMessage  异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentEquals(Object anObject1, Object anObject2, String aMessage) {
        if (!anObject1.equals(anObject2)) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言对象不相等
     *
     * @param anObject1 对象1
     * @param anObject2 对象2
     * @param aMessage  异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentNotEquals(Object anObject1, Object anObject2, String aMessage) {
        if (anObject1.equals(anObject2)) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言对象不为NULL
     *
     * @param anObject 对象
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentNotNull(Object anObject, String aMessage) {
        if (anObject == null) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数为假
     *
     * @param aBoolean 布尔值
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentFalse(boolean aBoolean, String aMessage) {
        if (aBoolean) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数为真
     *
     * @param aBoolean 布尔值
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentTrue(boolean aBoolean, String aMessage) {
        if (!aBoolean) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言字符串参数长度小于指定值
     *
     * @param aString  字符串
     * @param aMaximum 最大长度
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentLength(String aString, int aMaximum, String aMessage) {
        if (aString == null) {
            return;
        }
        int length = aString.trim().length();
        if (length > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言字符串参数长度在指定值之间
     *
     * @param aString  字符串
     * @param aMinimum 最小长度
     * @param aMaximum 最大长度
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentLength(String aString, int aMinimum, int aMaximum, String aMessage) {
        if (aString == null) {
            return;
        }
        int length = aString.trim().length();
        if (length < aMinimum || length > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言字符串参数不为空
     *
     * @param aString  字符串
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentNotEmpty(String aString, String aMessage) {
        if (aString == null || aString.trim().isEmpty()) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数在指定的范围内
     *
     * @param aValue   值
     * @param aMinimum 下界
     * @param aMaximum 上界
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentRange(double aValue, double aMinimum, double aMaximum, String aMessage) {
        if (aValue < aMinimum || aValue > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数在指定的范围内
     *
     * @param aValue   值
     * @param aMinimum 下界
     * @param aMaximum 上界
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentRange(float aValue, float aMinimum, float aMaximum, String aMessage) {
        if (aValue < aMinimum || aValue > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数在指定的范围内
     *
     * @param aValue   值
     * @param aMinimum 下界
     * @param aMaximum 上界
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentRange(int aValue, int aMinimum, int aMaximum, String aMessage) {
        if (aValue < aMinimum || aValue > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数在指定的范围内
     *
     * @param aValue   值
     * @param aMinimum 下界
     * @param aMaximum 上界
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentRange(long aValue, long aMinimum, long aMaximum, String aMessage) {
        if (aValue < aMinimum || aValue > aMaximum) {
            throw new InvalidArgumentException(aMessage);
        }
    }

    /**
     * 断言参数在指定的范围内
     *
     * @param aValue   值
     * @param aMinimum 下界
     * @param aMaximum 上界
     * @param aMessage 异常消息
     *
     * @throws InvalidArgumentException
     */
    protected void assertArgumentRange(BigDecimal aValue, BigDecimal aMinimum, BigDecimal aMaximum, String aMessage) {
        if (aValue.compareTo(aMinimum) <= 0 || aValue.compareTo(aMaximum) >= 0) {
            throw new InvalidArgumentException(aMessage);
        }
    }


    /**
     * 断言状态为假
     *
     * @param aBoolean 布尔值
     * @param aMessage 异常消息
     *
     * @throws InvalidStateException
     */
    protected void assertStateFalse(boolean aBoolean, String aMessage) {
        if (aBoolean) {
            throw new InvalidStateException(aMessage);
        }
    }

    /**
     * 断言状态为真
     *
     * @param aBoolean 布尔值
     * @param aMessage 异常消息
     *
     * @throws InvalidStateException
     */
    protected void assertStateTrue(boolean aBoolean, String aMessage) {
        if (!aBoolean) {
            throw new InvalidStateException(aMessage);
        }
    }
}
