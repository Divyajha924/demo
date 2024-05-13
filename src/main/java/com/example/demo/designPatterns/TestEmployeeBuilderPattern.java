package com.example.demo.designPatterns;

public class TestEmployeeBuilderPattern {

    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private TestEmployeeBuilderPattern(TestEmployeeBuilderPatternBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNumber= builder.phoneNumber;
        this.address = builder.address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

     private static class TestEmployeeBuilderPatternBuilder {

         private String name;

         private int age;

         private String phoneNumber;

         private String address;

         public TestEmployeeBuilderPatternBuilder name(String name) {
             this.name = name;
             return this;
         }

         public TestEmployeeBuilderPatternBuilder phoneNumber(String phoneNumber) {
             this.phoneNumber = phoneNumber;
             return this;
         }

         public TestEmployeeBuilderPatternBuilder address(String address) {
             this.address = address;
             return this;
         }

         public TestEmployeeBuilderPatternBuilder age(int age) {
             this.age = age;
             return this;
         }

         public TestEmployeeBuilderPattern build(){
             TestEmployeeBuilderPattern testEmployeeBuilderPattern = new TestEmployeeBuilderPattern(this);
             return testEmployeeBuilderPattern;
         }

    }

    public static void main(String[] args) {
        TestEmployeeBuilderPattern obj = new TestEmployeeBuilderPattern.TestEmployeeBuilderPatternBuilder()
                .name("Divya")
                .age(30)
                .address("bangalore")
                .phoneNumber("1234658789")
                .build();

    }

}
