package com.example.onlinestoremanagementsystem.products
/**
 * Represents a food-related product in the store, with additional details like expiration date.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product.
 * @property price The price of the product in the store.
 * @property expirationDate The expiration date of the food product.
 * @property isBio Whether the product is organic.
 * @property isVegan Whether the product is vegan.
 */
class FoodProduct(
    override val id: String,
    override val name: String,
    override var status: Enum<Status>,
    override var price: Double,
    var expirationDate: String,
    var isBio: Boolean,
    var isVegan: Boolean
) : Product() {
    /**
     * Prints all information about the food product, including expiration date and dietary details.
     *  Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("expiration date: ${expirationDate} is Bio: ${isBio} is Vegan :${isVegan}")
    }
}