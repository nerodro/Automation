package baseTest.Manager;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerModel {
    public String firstName;
    public String lastName;
    public String postCode;
}
