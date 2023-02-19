package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.platoandroid.R
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.ProjectFileStructurePaneHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsABestPractice
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.StepEighteenCheckCode
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.StepNineteenCheckCode
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.StepSeventeenCodeCheck
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.StepTwentyButtonsNotWorkingHelp

class ViewModelSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "As we mentioned before, we use these special classes to keep things like complex state data logic isolated from the view.\n" +
        "Right now, all of the data logic for our todo list item is handled in the view itself.\n")
      Text(text = "That is fine for now because it’s pretty simple but as we add more complexity to the logic controlling our todo list, it’s going to get very hard to look at the code and understand what is going on.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "So when we add a viewmodel, we will be able to pull out all of the logic controlling the todo list data and keep it separate from the code that actually builds the UI itself.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Here is a diagram to help you visualize how the ViewModel and view work together.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Notice it talks about a “Data Layer” & “UI Layer” - we will talk more about what those mean later on in the Architecture section.")
      // DataLayerDiagramImage()
      Text(text = "Look at the documentation to learn alittle more:")
      Text(
        text = "https://developer.android.com/topic/architecture/ui-layer/stateholders",
        color = MaterialTheme.colors.primaryVariant,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }

  @Composable
  private fun DataLayerDiagramImage() {
    ResourcesCompat.getDrawable(
      LocalContext.current.resources,
      R.mipmap.first_text_sample_foreground,
      LocalContext.current.theme
    )?.let { drawable ->
      val bitmap = Bitmap.createBitmap(
        drawable.intrinsicWidth,
        drawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
      )
      val canvas = Canvas(bitmap)
      drawable.setBounds(0, 0, canvas.width, canvas.height)
      drawable.draw(canvas)
      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
      ) {
        Image(
          bitmap = bitmap.asImageBitmap(),
          "An image",
          modifier = Modifier.requiredSize(400.dp)
        )
      }
    }
  }
}

class ViewModelSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "You may hear this referred to as “separation of concerns” as you code more. It’s always considered a best practice in programming that each element in your code should have one clearly defined purpose.")
      HelpButton("what is a best practice") {
        onHelpRequest { WhatIsABestPractice() }
      }
      Text(text = "In this case, the clearly defined purpose of our view will be to handle displaying the UI and the clearly defined purpose of our viewmodel will be to manage all of the data our view needs to build its UI.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
        // Spacer(modifier = Modifier.width(8.dp))
        // Button(
        //   onClick = { onHelpRequest { /** TODO */ } },
        //   colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        // ) {
        //   Text(text = "Tell me more")
        // }
      }
    }
  }
}

class ViewModelSupStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "So let’s look at how we create a viewmodel - we will practice by adding a viewmodel for our Todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Go back to the TodoList.kt file we have been working in.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Im there")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { HowToSearchAFileName() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "How to search")
        }
      }
    }
  }
}

class ViewModelSupStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "If you look in the pane on the left, you should see a listing of the files in this project.")
      HelpButton("I don't see this pane") {
        onHelpRequest { ProjectFileStructurePaneHint() }
      }
      Text(text = "Look for the TodoList.kt file in this list, you will notice it is under a folder path of `app` -> `java` -> `com/example/platoandroid` -> `ui`")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In the `ui` folder, look for a TodoListViewModel.kt file we already have started for you and open that file.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Im there")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I can't find it")
        }
      }
    }
  }
}

class ViewModelSupStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "In the view model class, you'll find a variable called `todoListItems` already created.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "todoListItems is a List and we are going to use it to hold the list of TodoListItem's we want to display in our todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You'll notice the data type we assigned to todoListItems is a special type of List: SnapshotStateList")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What is a SnapshotStateList?")
        }
      }
    }
  }
}

class ViewModelSupStepSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "SnapshotStateList is another special data type that android provides that is similar to MutableState.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "SnapshotStateList is specially designed to wrap lists of items and watch them for updates.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You don't need to know exactly what this does under the hood, just that it's a good data type to communicate updates to a list to your Compose UI.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Don't forget - if you ever want to learn more about SnapshotStateList or explore other data types, Androids documentation is a great place to look!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "todoListItems currently is set to a value of mutableStateListOf()")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "mutableStateListOf is another helper function android provides that generates list of items you pass it wrapped in the SnapshotStateList data type.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Inside of function parentheses on mutableStateListOf - add a few TodoListItems you want to have in your todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepNine : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Go back to the TodoList.kt file and go to where you previously defined the individual TodoListRow composables inside of the TodoList composable.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Go ahead and delete all the TodoListRow items you currently have there.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Done")
        }
      }
    }
  }
}

class ViewModelSupStepTen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now that you have those removed, we want to replace them with the items from the list in your ViewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The first thing we need, is a reference to our view model to retrieve the list from.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do that create a new variable on your TodoList composable called viewModel and set it to an instance of your TodoListViewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This will look like:")
      Text(
        text = "val viewModel: TodoListViewModel = TodoListViewModel()"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepTwelve : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Remember when we used the MutableState with `remember` - the job of `remember` was to handle making sure our state was managed efficiently behind the scenes.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "ViewModels have similar helper - update your viewModel variable to look like this:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "val viewModel: TodoListViewModel = viewModel { TodoListViewModel() }")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You don't worry too much about what this does, just know it's a helpful tool that will make your app more efficient. You can always learn more about view models with compose by looking through Androids documentation!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepThirteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now that we have a reference to our viewModel, let's populate TodoListRows for each of the items in our todoListItems value on our viewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You can access this variable on your viewModel like this: viewModel.todoListItems")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We can use a loop to traverse our list and add a TodoListRow composable for each TodoListItem in the list on our viewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Kotlin has some special syntax for looping through lists called `forEach`.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In the space where the manually added TodoListRows used to be, add this:")
      Text(text = "viewModel.todoListItems.forEach { todoListItem ->\n" +
        "    TodoListRow(todoItem = todoListItem)\n" +
        "  }")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepFourteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now that we have a reference to our viewModel, let's populate TodoListRows for each of the items in our todoListItems value on our viewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You can access this variable on your viewModel like this: viewModel.todoListItems")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We can use a loop to traverse our list and add a TodoListRow composable for each TodoListItem in the list on our viewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Kotlin has some special syntax for looping through lists called `forEach`.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In the space where the manually added TodoListRows used to be, add this:")
      Text(text = "viewModel.todoListItems.forEach { todoListItem ->\n" +
        "    TodoListRow(todoItem = todoListItem)\n" +
        "  }")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepFifteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Rebuild your app and you should now see the tasks you added to the todoListItems variable on your viewModel displayed in your todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Now that our list of todo items is hooked up to our viewModel, we also want to hook up the onClick callbacks on our buttons to trigger the right functions in our TodoListViewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "By doing this, we move the onClick logic to our view model which was our goal - to move logic out of the view and into the view model.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we hook these up?")
        }
      }
    }
  }
}

class ViewModelSupStepSixteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "The first button we will hook up is our `Add item` button.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The Add item button is part of our TodoList component so we already have a reference to the viewModel here.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Go to the onClick method on the Add item button and add viewModel.addTodoListItem() inside the onClick function brackets. This will end up looking like:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Button(onClick = {\n" +
        "      viewModel.addTodoListItem()\n" +
        "    }) {\n" +
        "      Text(text = \"Add Item\")\n" +
        "    }")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Aren't we missing the new item?")
        }
      }
    }
  }
}

class ViewModelSupStepSeventeen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "The addTodoListItem wants us to pass in the new item we want to create.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Try creating a new TodoListItem and pass it into the viewModel.addTodoListItem function.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Click the Check code button to see how yours compares!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepSeventeenCodeCheck() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class ViewModelSupStepEighteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "The other buttons we need to hook up live in our TodoListRow component - so we need to pass a reference to our viewModel from TodoList into our TodoListRow.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can figure out how to do this yourself.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Once you've given it a try, click the Check code button to see how you did!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepEighteenCheckCode() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class ViewModelSupStepNineteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now that you have access to viewModel in your TodoListRow, try hooking up the onClick callbacks for the 3 buttons you have in TodoListRow.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "1. The green check mark should call viewModel.markTodoListItemNotComplete")
      Text(text = "2. The gray check mark should call viewModel.markTodoListItemComplete")
      Text(text = "3. The x should call a new method you will add to the viewModel that you will name removeTodoListItem")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can figure out how to hook these up and then click Check code to compare your code!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepNineteenCheckCode() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class ViewModelSupStepTwenty : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Nice job! All your buttons should be hooked up to your view model now!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We haven't looked up the logic for these button clicks yet but they have some log statements in them.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Try re-building your app and click some of the buttons, they wont do anything in the app but you should be able to see the logs in logcat if everything is hooked up right!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Done")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepTwentyButtonsNotWorkingHelp() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need help")
        }
      }
    }
  }
}

class ViewModelSupStepTwentyOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Let's finish filling in the logic in your TodoListViewModel.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Open the TodoListViewModel file and follow the directions in the comments to update the logic.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Once you finish, re-build your app to test it out!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do I use the text field?")
        }
      }
    }
  }
}

// class ViewModelSupStepSix : TutorialSubStepBlockState {
//   @Composable
//   override fun displayBlock(
//     onHelpRequest: (request: @Composable () -> Unit) -> Unit,
//     showNextStep: () -> Unit
//   ) {
//     TutorialStepCard(title = "ViewModels") {
//       Text(text = "Right mouse click on the `ui` folder. \nIn the menu, navigate to New -> Kotlin Class/File")
//       Spacer(modifier = Modifier.height(8.dp))
//       Text(text = "A dialog will come up asking you for a new file name, type:")
//       Text(text = "       TodoListViewModel", fontWeight = FontWeight.Bold)
//       Text(text = "and click enter.")
//       Spacer(modifier = Modifier.height(8.dp))
//       Row {
//         Button(onClick = { showNextStep() }) {
//           Text(text = "I created the file")
//         }
//         Spacer(modifier = Modifier.width(8.dp))
//         Button(
//           onClick = { onHelpRequest { /** TODO */ } },
//           colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
//         ) {
//           Text(text = "Help")
//         }
//       }
//     }
//   }
// }
