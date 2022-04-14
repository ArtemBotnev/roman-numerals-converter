[![](https://jitpack.io/v/ArtemBotnev/roman-numerals-converter.svg)](https://jitpack.io/#ArtemBotnev/roman-numerals-converter)

## Roman Numerals Converter
#### Simple Kotlin converter for easy convert Arabic numerals to roman and vice versa.
#### Example of usage:
```kotlin
val converter = RomanNumeralConverter()
// Convert Arabic to roman
converter.intToRoman(68)
// result LXVIII
// Convert roman to Arabic
converter.romanToInt("MMXXII")
// result 2022
```
In a similar way, you can use it in java code

#### To use this, add dependencies to your project:
Jitpack repository to your root build.gradle at the end of repositories
```groovy
allprojects {
 repositories {
  ...
  maven { url 'https://jitpack.io' }
  }
 }
```
and to module level build.gradle
```groovy
dependencies {
 implementation 'com.github.ArtemBotnev:roman-numerals-converter:1.1.4'
}
```