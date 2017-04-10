package org.zeroturnaround.jf.examples;

public class Ex2_Annotations {

    public static void main(String[] args) {
        Class<SomeClass> clazz = SomeClass.class;
        boolean isResource = clazz.isAnnotationPresent(Resource.class);
        if (isResource) {
            Resource resource = clazz.getAnnotation(Resource.class);
            System.out.println("Resource path is '" + resource.path() + "'");
        }
    }
}


