package AddressBook;



public class Address {
  // implements Comparable
  private String id = null;
  private String lastName = null;
  private String firstName = null;
  private String street = null;
  private String district = null;
  private String city = null;
  private String zipcode = null;

  public Address (String id, String lastName, String firstName, String street, String city, String zipcode)
  {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.street = street;
    this.city = city;
    this.zipcode = zipcode;
  }

  public String getId ()
  {
    return this.id;
  }

  public String getLastName ()
  {
    return this.lastName;
  }

  public String getFirstName ()
  {
    return this.firstName;
  }

  public String getStreet ()
  {
    return this.street;
  }

  public String getCity ()
  {
    return this.city;
  }

  public String getZipCode ()
  {
    return this.zipcode;
  }

  public String getFullname ()
  {
    return this.firstName + " " + this.lastName;
  }

  public String getFullAddress ()
  {
    return this.street + " " + this.district + " " + this.city + " " + this.zipcode;
  }

  public int compareTo (Object object)
  {
    Address address = (Address) object;
    int compare = this.lastName.compareToIgnoreCase (address.lastName);
    if (compare == 0)
    {
      compare = this.firstName.compareToIgnoreCase (address.firstName);
    }
    return (compare);
  }
}
