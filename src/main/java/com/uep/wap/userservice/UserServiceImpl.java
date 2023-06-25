@Service
public class UserServiceImpl implements UserService, UserRegistrationImpl {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser() {
        registerUser(null);
    }

    @Override
    public void registerUser(User user) {
        if (isValidUser(user)) {
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("Nieprawidłowe dane użytkownika");
        }
    }

    private boolean isValidUser(User user) {
    }

    @Override
    public boolean login(String email, String password) {
        if (isValidLogin(email, password)) {
            User user = userRepository.findByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidLogin(String email, String password) {
    }
}
