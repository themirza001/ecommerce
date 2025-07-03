package com.mirza.ecommerce.dto.response;



import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String email;
    private String username;
    private String password;
    private Name name;
    private Address address;
    private String phone;

    @Data
    public static class Name {
        private String firstname;
        private String lastname;
    }

    @Data
    public static class Address {
        private String city;
        private String street;
        private String number;
        private String zipcode;
        private GeoLocation geolocation;

        @Data
        public static class GeoLocation {
            private Double lat;
            private Double _long; // using `_long` because `long` is a reserved keyword
        }
    }
}
