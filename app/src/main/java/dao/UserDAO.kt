package dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import entity.UserEntity

@Dao
interface UserDAO {

    @Query("SELECT * FROM auth WHERE username=:username AND password=:password LIMIT 1")
    fun getUser(username: String, password: String): UserEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userEntity: UserEntity): Long
}