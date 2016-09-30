SUMMARY = "Node.js module to interact with official Telegram Bot API."
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e042b17e4c710c522627f263dfe32f33"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/yagop/${PN}/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "e23ad24073fcc812078ebaa2c784ac46"
SRC_URI[sha256sum] = "83f78e8612e6ae4c9f1ea8d6503dfb241316525d14ba8d0e4902f16fd3456234"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"

