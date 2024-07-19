package hibernate.advanced.mappings.dao;

import hibernate.advanced.mappings.entity.Instructor;
import hibernate.advanced.mappings.entity.InstructorDetail;

public interface AppDAO  {

    void save(Instructor instructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

}
