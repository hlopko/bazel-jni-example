package(default_visibility = ["//visibility:public"])

java_binary(
    name = "Main",
    srcs = ["Main.java"],
    data = ["//cpp:libmain-jni.so"],
    jvm_flags = ["-Djava.library.path=cpp"],
    main_class = "Main",
)
