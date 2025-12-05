package com.techgeeni.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String addressLine1, String addressLine2, String city, String state, String country) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Srini";
    }

    @Bean
    public Integer age() {
        return 15;
    }

    @Bean
    public Person person() {
        var person = new Person("Srini", 43);

        System.out.println(person.toString());
        return person;
    }

    @Bean
    public Address address() {
        var address = new Address("3041 Sunfish St","","Prosper","TX","USA");

        System.out.println(address.toString());
        return address;
    }


}
