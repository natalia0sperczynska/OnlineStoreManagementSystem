package com.example.onlinestoremanagementsystem.manage

import com.example.onlinestoremanagementsystem.users.User
/**
 * Interface for managing user-related actions within the store system.
 */
interface manageableUsers {
    /**
     * Adds a user to the store’s user management system.
     *
     * @param user The user to be added.
     * @param management The store management instance responsible for adding users.
     */
    fun addUser(user: User, management: Management) {
        management.addUser(user)
    }
    /**
     * Removes a user from the store’s user management system.
     *
     * @param user The user to be removed.
     * @param management The store management instance responsible for deleting users.
     */
    fun deleteUser(user: User, management: Management) {
        management.deleteUser(user)
    }
}