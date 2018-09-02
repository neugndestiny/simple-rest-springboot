package warakorn.springframework.simplespringbootapi.services;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String getStudent() {
        return "Warakorn Neung";
    }
}
