SUMMARY = "A Long class for representing a 64-bit two's-complement integer value."
HOMEPAGE = "http://dcode.io"
SECTION = "js/devel"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/dcodeIO/long.js/archive/${PV}.tar.gz"

SRC_URI[md5sum] = "3ab2925be924ff23c7681a1cd0499c0c"
SRC_URI[sha256sum] = "fc93479e40061a3eebd811cedb5fbcc87638e2a2116ba52419942150bf7fef41"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
