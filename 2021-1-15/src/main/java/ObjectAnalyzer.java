import jdk.nashorn.internal.runtime.PrototypeObject;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectAnalyzer {
    public String toString(Object obj){
        Class cl = obj.getClass();
        String r = cl.getName();
        do{
            r+="[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
            //get the names and values of all fields
            for(Field f : fields){
                if(!Modifier.isStatic(f.getModifiers())){
                    if(!r.endsWith("["))r+=",";
                    r+=f.getName()+"=";
                    try{
                        Object val = f.get(obj);
                        r+=toString(val);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            r+="]";
            cl = cl.getSuperclass();
        }
        while (cl!=null);
        return r;
    }
}
