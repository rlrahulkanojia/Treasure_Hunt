---
services: cognitive-services,custom-vision
platforms: java, Android
author: rlrahulkanojia
---

# Android application using machine learning model for treasure hunt
This application demonstrates how to take a model in the TensorFlow format and add it to an application for real-time image classification. 

## Getting Started

### Prerequisites
- [Android Studio (latest)](https://developer.android.com/studio/index.html)
- Android device
- Pre-trained model
### Quickstart

1. Clone the repository and open the project in Android Studio
2. Build and run the sample on your Android device
### Replacing the sample model with your own classifier 
The model provided with the application recognizes some hints which were part of treasure hunt. To replace it with your own model do the following, and then build and launch the application:
  1. Create your own custom classifer.
  2. Export your model in .pb format and labels in .txt format.
  3. Drop your *model.pb* and *labels.txt* file into your Android project's Assets folder. 
  4. Build and run.

### Compatibility
Android device which support Camera level 2 Api and Android 6+.
