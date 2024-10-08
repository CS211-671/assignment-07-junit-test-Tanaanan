package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList users;

    @BeforeEach
    void init(){
        users = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        users.addUser("M", "password");
        users.addUser("Jate", "ThisIsAPassword!");
        users.addUser("Kawpod", "Passdesu..");
        // TODO: find one of them
        // TODO: assert that UserList found User
        assertNotNull(users.findUserByUsername("Kawpod"));
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        users.addUser("M", "password");
        users.addUser("Jate", "ThisIsAPassword!");
        users.addUser("Kawpod", "Passdesu..");
        // TODO: change password of one user
        users.changePassword("Kawpod","Passdesu..", "O w O");
        // TODO: assert that user can change password
        assertNotNull(users.login("Kawpod", "O w O"));
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        users.addUser("M", "password");
        users.addUser("Jate", "ThisIsAPassword!");
        users.addUser("Kawpod", "Passdesu..");
        // TODO: call login() with correct username and password
        User exist = users.login("Kawpod","Passdesu..");
        // TODO: assert that User object is found
        assertNotNull(exist);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        users.addUser("M", "password");
        users.addUser("Jate", "ThisIsAPassword!");
        users.addUser("Kawpod", "Passdesu..");
        // TODO: call login() with incorrect username or incorrect password
        User exist = users.login("KawPod", "Passuwordodesuka");
        // TODO: assert that the method return null
        assertNull(exist);
        // assertNull(actual);
    }

}