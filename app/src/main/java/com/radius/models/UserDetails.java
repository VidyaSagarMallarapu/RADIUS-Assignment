package com.radius.models;


public class UserDetails {
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public void setName(Name name) {
        this.name = name;
    }

    private String gender;
    private String email,phone,cell,nat;
    private Location location;
    Login login;
    Timezone timezone;
    Dob dob;
    Registered registered;
    Id id;
    Picture picture;
    Name name;
    public String getGender() {
        return gender;
    }



    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public String getNat() {
        return nat;
    }

    public Location getLocation() {
        return location;
    }

    public Login getLogin() {
        return login;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public Dob getDob() {
        return dob;
    }

    public Registered getRegistered() {
        return registered;
    }

    public Id getId() {
        return id;
    }

    public Picture getPicture() {
        return picture;
    }

    public Name getName() {
        return name;
    }


    public static class Id
    {
        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private String name,value;
    }
    public static class  Picture
    {
        public String getLarge() {
            return large;
        }

        public String getMedium() {
            return medium;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        private String  large,medium,thumbnail;
    }

    public static class Dob
    {
        public String getDate() {
            return date;
        }

        public String getAge() {
            return age;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setAge(String age) {
            this.age = age;
        }

        private String date;
        private String age;
    }
    public static class Registered
    {
        public String getDate() {
            return date;
        }

        public String getAge() {
            return age;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setAge(String age) {
            this.age = age;
        }
        private String date;
        private String age;

    }
    public static class Login
    {
        public String getUuid() {
            return uuid;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getSalt() {
            return salt;
        }

        public String getMd5() {
            return md5;
        }

        public String getSha1() {
            return sha1;
        }

        public String getSha256() {
            return sha256;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public void setSha1(String sha1) {
            this.sha1 = sha1;
        }

        public void setSha256(String sha256) {
            this.sha256 = sha256;
        }

        private String uuid,username,password,salt,md5,sha1,sha256;
    }

    public static class Name
    {
        public String getTitle() {
            return title;
        }

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public void setLast(String last) {
            this.last = last;
        }

        private  String title,first,last;
    }
    public static class Location
    {
        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getPostcode() {
            return postcode;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        private String street,city,state,postcode;
        Coordinates coordinates;
    }
    public static class Coordinates
    {
        public String getLatitude() {
            return latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        private String latitude,longitude;
    }
    public static class Timezone
    {
        public String getOffset() {
            return offset;
        }

        public String getDescription() {
            return description;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        private String offset,description;
    }



}
