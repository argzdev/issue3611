# Issue 3611
### Prerequisite
- Add google-services.json
- Enable Firestore
### Summary
- TLDR: `com.google.firebase.firestore.util.CustomClassMapper.BeanMapper.serialize()` is unable to serialize Uri objects.
### How to use
- Running the app will immediately cause a crash due to an infinite loop of `com.google.firebase.firestore.util.CustomClassMapper$BeanMapper.serialize(CustomClassMapper.java:902)`
