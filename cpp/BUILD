package(default_visibility = ["//visibility:public"])

cc_library(
    name = "main-jni-lib",
    srcs = ["Main.cc"],
    hdrs = ["Main.h"],
    deps = ["//tools/jni:copy_jni_hdr_lib"],
    alwayslink = True,
)

cc_binary(
    name = "libmain-jni.so",
    linkshared = True,
    deps = [":main-jni-lib"],
)
