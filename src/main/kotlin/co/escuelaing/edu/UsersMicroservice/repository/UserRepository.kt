package co.escuelaing.edu.UsersMicroservice.repository 

import org.springframework.data.mongodb.repository.MongoRepository;
import co.escuelaing.edu.UsersMicroservice.data.User;

interface UserRepository: MongoRepository<User, String>
{
    // override fun insert(user: User): User
    // override fun findById(id: String): List<User>
    // override fun findAll(): List<User>
    // override fun deleteById(id: String)
    // override fun update(user: User, userId: String ): User?
    fun findOneById(id: String): User
    override fun deleteAll()
}