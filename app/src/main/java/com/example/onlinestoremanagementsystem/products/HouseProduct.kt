package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.products.categories.CategoryHouseProduct
/**
 * Represents a house-related product in the store.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product.
 * @property price The price of the product in the store.
 * @property category The category of the house product (e.g., KITCHEN, ROOM).
 */
class HouseProduct(override val id:String,
                   override val name:String,
                   override var status :Enum<Status>,
                   override var price:Double,
                   val category:Enum<CategoryHouseProduct>
) : Product() {
    /**
     * Prints all information about the house product, including its category.
     * Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("category: ${category}")
    }
}