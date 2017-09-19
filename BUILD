cc_library(
    name = "main-jni-lib",
    srcs = [
        "@local_jdk//:jni_header",
        "@local_jdk//:jni_md_header-linux",
        "Main.cc"
        ],
    hdrs = [ "Main.h" ],
    includes = [ "external/local_jdk/include", "external/local_jdk/include/linux" ],
)

cc_binary(
    name = "libmain-jni.so",
    deps = [ ":main-jni-lib" ],
    linkshared = 1,
)

java_binary(
    name = "Main",
    srcs = [ "Main.java" ],
    main_class = "Main",
    data = [ ":libmain-jni.so" ],
    jvm_flags = [ "-Djava.library.path=." ],
)

