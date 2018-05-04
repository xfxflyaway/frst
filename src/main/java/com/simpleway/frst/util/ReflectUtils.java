package com.simpleway.frst.util;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.base.Sort;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author Administrator
 * 
 */
public class ReflectUtils {

  @SuppressWarnings("unchecked")
  public static <T> T getBean(Map<String, String> param, Class<?> clazz) {
    Object value = null;
    Class<?>[] paramTypes = new Class[1];
    Object obj = null;
    try {
      // 创建实例
      obj = clazz.newInstance();
      Field[] f = clazz.getDeclaredFields();
      List<Field[]> flist = new ArrayList<Field[]>();
      flist.add(f);

      Class<?> superClazz = clazz.getSuperclass();
      while (superClazz != null) {
        f = superClazz.getFields();
        flist.add(f);
        superClazz = superClazz.getSuperclass();
      }

      for (Field[] fields : flist) {
        for (Field field : fields) {
          String fieldName = field.getName();
          value = param.get(fieldName);
          if (value != null) {
            paramTypes[0] = field.getType();
            Method method = null;
            // 调用相应对象的set方法
            StringBuffer methodName = new StringBuffer("set");
            methodName.append(fieldName.substring(0, 1).toUpperCase());
            methodName.append(fieldName.substring(1, fieldName.length()));
            // 测试输出
            System.out.println(paramTypes[0].getName());

            method = clazz.getMethod(methodName.toString(), paramTypes);
            method.invoke(obj, ConvertUtil.getValue(value.toString(), fieldName, paramTypes[0]));
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return (T) obj;
  }

  @SuppressWarnings("unchecked")
  public static <T> T getWhereBean(Map<String, String> param, Class<?> clazz) {
    Object value = null;
    Class<?>[] paramTypes = new Class[1];
    Object obj = null;
    try {
      // 创建实例
      obj = clazz.newInstance();
      Field[] f = clazz.getDeclaredFields();
      List<Field[]> flist = new ArrayList<Field[]>();
      flist.add(f);

      Class<?> superClazz = clazz.getSuperclass();
      while (superClazz != null) {
        f = superClazz.getDeclaredFields();
        flist.add(f);
        superClazz = superClazz.getSuperclass();
      }

      for (Field[] fields : flist) {
        for (Field field : fields) {
          String fieldName = field.getName();
          if("orders".equals(fieldName)) {
            if(param.containsKey("sidx") && NullUtil.isNotEmpty(param.get("sidx"))) {
              if(param.containsKey("sord") && NullUtil.isNotEmpty(param.get("sord"))) {
                String orderField = param.get("sidx");
                List<Sort> list = new ArrayList<>();
                if (NullUtil.isEmpty(param) || NullUtil.isEmpty(param.get("sidx"))
                    || NullUtil.isEmpty(param.get("sord"))) {
                  list.add(new Sort(BaseConstant.DESC, "id"));
                } else {
                  String sord = param.get("sord");
                  if (sord.equals("asc")) {
                    list.add(new Sort(orderField, BaseConstant.ASC));
                  } else {
                    list.add(new Sort(orderField, BaseConstant.DESC));
                  }
                }
                paramTypes[0] = field.getType();
                Method method = null;
                // 调用相应对象的set方法
                StringBuffer methodName = new StringBuffer("set");
                methodName.append(fieldName.substring(0, 1).toUpperCase());
                methodName.append(fieldName.substring(1, fieldName.length()));
    
                method = clazz.getMethod(methodName.toString(), paramTypes);
                method.invoke(obj, list);
              }
            }
          } else if("pageSize".equals(fieldName)) {
            if(param.containsKey("rows") && NullUtil.isNotEmpty(param.get("rows"))) {
              value = Integer.parseInt(param.get("rows") + "");
              paramTypes[0] = field.getType();
              Method method = null;
              // 调用相应对象的set方法
              StringBuffer methodName = new StringBuffer("set");
              methodName.append(fieldName.substring(0, 1).toUpperCase());
              methodName.append(fieldName.substring(1, fieldName.length()));
  
              method = clazz.getMethod(methodName.toString(), paramTypes);
              method.invoke(obj, ConvertUtil.getValue(value.toString(), fieldName, paramTypes[0]));
            }
          } else if("pageNo".equals(fieldName)) {
            if(param.containsKey("page") && NullUtil.isNotEmpty(param.get("page"))) {
              value = Integer.parseInt(param.get("page") + "");
              paramTypes[0] = field.getType();
              Method method = null;
              // 调用相应对象的set方法
              StringBuffer methodName = new StringBuffer("set");
              methodName.append(fieldName.substring(0, 1).toUpperCase());
              methodName.append(fieldName.substring(1, fieldName.length()));
  
              method = clazz.getMethod(methodName.toString(), paramTypes);
              method.invoke(obj, ConvertUtil.getValue(value.toString(), fieldName, paramTypes[0]));
            }
          } else {
            value = param.get(fieldName);
            if (value != null) {
              paramTypes[0] = field.getType();
              Method method = null;
              // 调用相应对象的set方法
              StringBuffer methodName = new StringBuffer("set");
              methodName.append(fieldName.substring(0, 1).toUpperCase());
              methodName.append(fieldName.substring(1, fieldName.length()));

              method = clazz.getMethod(methodName.toString(), paramTypes);
              method.invoke(obj, ConvertUtil.getValue(value.toString(), fieldName, paramTypes[0]));
            }
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return (T) obj;
  }
}
