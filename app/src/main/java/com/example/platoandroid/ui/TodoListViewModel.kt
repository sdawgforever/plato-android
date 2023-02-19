package com.example.platoandroid.ui

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.example.platoandroid.data.TodoListItem

/**
 * ViewModel's generally manage state and business logic for a single
 * screen. If you find you have one view model being shared between
 * multiple screens, you should consider moving that logic to your "domain"
 * layer and having it be used by several ViewModels that each belong to
 * a single screen.
 *
 * Notice that this class extends a class called ViewModel.
 * ViewModel is a class provided by Android hat gives us access
 * to lots of tools that help us manage state and data more
 * easily.
 *
 * Note: remember, when we say a class "implements" or "extends"
 * another class, it means the other class is an interface (a
 * pre-defined set of functionality our class must support) or an
 * open class that will let our class have access to additional
 * functionality it provides.
 *
 * Read through the comments throughout the file and follow the prompts
 * to fill in missing pieces.
 */
class TodoListViewModel() : ViewModel() {
  /**
   * This is the body of our view model where all the logic will live.
   */
  var todoListItems: SnapshotStateList<TodoListItem> = mutableStateListOf()

  /**
   * This function is used to add items to todoListItems
   * SnapshotStateList has a function called `add` that can be used to add items to the list.
   * This operation will also trigger a re-render of our UI if todoListItems is being observed
   * on.
   */
  fun addTodoListItem(item: TodoListItem) {
    Log.d("TODO_LIST_TEST_TAG", "Item with id: ${item.id} added to the list!")
    todoListItems.add(item)
    // This function is done for you as an example - no more to do here!
  }

  /**
   * This function is used to mark an item in todoListItems as complete.
   *
   * The operations used here will not automatically trigger a re-render of our UI if
   * todoListItems is being observed on since we are only updating an element within the
   * list rather than updating the list itself. We need to account for that.
   */
  fun markTodoListItemComplete(id: String) {
    Log.d("TODO_LIST_TEST_TAG", "Item with id: $id marked complete!")
    /**
     * Since we are provided an `id` of the item and not the item itself, we first
     * need to search through the list and find the item matching the given id.
     * Uncomment itemToUpdate below and set it equal to this:
     * todoListItems.find { it.id == id }
     *
     * `find` is an operation on SnapshotStateList that let's us search for and retrieve
     * the first item matching the criteria specified in the function brackets.
     */
    //val itemToUpdate =

    /**
     * We will also want to know the index (the position) of this item in todoListItems
     * To retrieve this, un-comment the itemToUpdateIndex value below and set it
     * equal to this:
     * todoListItems.indexOf(itemToUpdate)
     *
     * `indexOf` is an operation on SnapshotStateList that let's you retrieve the index
     * of given value in the list by providing that value.
     */
    //val itemToUpdateIndex =

    /**
     * Below this comment, on todoListItems, access the TodoListItem at the found index and
     * set the isComplete value to true.
     */
    // Set isComplete = true here vvv

    // ^^^ Set isComplete = true above
  }

  /**
   * This function is used to mark an item in todoListItems as complete.
   *
   * The operations used here will not automatically trigger a re-render of our UI if
   * todoListItems is being observed on since we are only updating an element within the
   * list rather than updating the list itself. We need to account for that.
   */
  fun markTodoListItemNotComplete(id: String) {
    Log.d("TODO_LIST_TEST_TAG", "Item with id: $id marked not complete!")
    // Using the techniques you learned when completing the function to mark items as
    // complete, in this function, update the item in todoListItems that matches the
    // passed in id to have an isComplete value of false.

  }

  /**
   * This function will be used to remove items from todoListItems
   * SnapshotStateList has a function called `remove` that can be used to remove an item
   * from the list but it requires us passing in the item we want to remove.
   *
   * The `remove` operation will also trigger a re-render of our UI if todoListItems is being
   * observed on.
   */
  // Add a method for deleting a todo list item here vvv
  // name the method removeTodoListItem

  // Add method above ^^^
}