package com.example.platoandroid.data

import java.util.Date

/**
 * This class will be used to represent todo list items in our app.
 * This is a data class meant to represent pieces of complex data &
 * package all the values relating to a specific concept in our app
 * in one data type.
 * Data classes are denoted by the keyword `data` prefix before `class`
 */

/**
 * Data classes can be used as data types throughout your app much
 * the same way as we use simple data types like String, Int, or Boolean.
 *
 * For example, if you have a variable representing a todo list item, you
 * could write something like:
 *
 * var todoListItem: TodoListItem = TodoListItem(taskName = "thing to do")
 *
 * Then we could access the values of our custom data type like:
 *
 * todoListItem.taskName // would return "thing to do"
 */

/**
 * Our TodoListItem data class is started below, but we need some more
 * values to represent everything about a TodoListItem.
 * In the constructor below `taskName` (in between the comments), add
 * some more values to represent the following:
 *  isCompleted of type Boolean
 *  completedAt of type Date?
 *  dueDate of type Date? // remember, adding a ? to the end of the data type means it can be null, see more below
 *
 *  We will also default dueDate & completedAt to null. You can default a value by assigning
 *  it with the equals operator in the constructor. This will look something like:
 *  (
 *    ...
 *    val dueDate: Date? = null // this defaults dueDate to null
 *  )
 *
 *  Defaulting means when we create a new TodoListItem, if we don't explictly provide
 *  a value for dueDate, dueDate will default to null. If a value is explicitly
 *  provided, it will override the default null value and be used instead.
 *
 *  HINT: `null` is a value that represents something NOT existing, ie. if something is null,
 *  that means no value is set for it - it's nothing.
 */

/**
 * If you want a value to be OPTIONAl, you can make it nullable by adding a ? to the end.
 * For example if we were creating a TodoListItem with a nullable dueDate, we
 * could write something like:
 * val todoListItemWithNoDueDate = TodoListItem(taskName = "thing to do", dueDate = null)
 *
 * OR you could write a todo list item with a date like:
 * val todoListItemWithDueDate = TodoListItem(taskName = "thing to do", dueDate = Date())
 *
 * since the nullable type will except both null or a value.
 *
 * Note: When you access a nullable value, you will need to be aware of the fact the value
 * could be null. If you are sure its not null, you can "force unwrap it" to treat it as a
 * non-null data type by using a "bang bang" operator like this:
 * val dueData: Date = todoListItemWithDueDate.dueDate!!
 *
 * If you don't use the bang bang, the data type will need to be handled as one that could
 * be null. You may need to use if statements to check it its null or not.
 */

data class TodoListItem(
  // the constructor arguments go here vvv
  // It's important that we have a unique ID so we can tell different todo list
  // items apart even if they have the same taskName.
  // When creating new items, you can always use `Random(101).toString()` to generate
  // a new, unique, random Id.
  val id: String,
  val taskName: String,
  // add the additional values a todo list item will need below vvv

  // add todo list item values above ^^^
) {
  // This is the body of the data class.
  // Data classes do not NEED to have a body.
}